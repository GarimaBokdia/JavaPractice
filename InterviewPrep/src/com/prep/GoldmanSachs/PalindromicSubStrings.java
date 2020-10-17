package com.prep.GoldmanSachs;

public class PalindromicSubStrings {

	
	// A utility function to print 
    // a substring str[low..high] 
    static int printSubStr( 
        String str, boolean table[][]) 
    { 
    	int counter=0;
    	for(int i=0;i<table.length;i++)
    	{
    		for(int j=0;j<table[i].length;j++)
    		{
    			if(table[i][j]==true)
        		{
    				counter++;
        			System.out.println( 
            	            str.substring( 
            	                i, j + 1)); 
        		}
    		}
    		
    		
    		
    	}
        return counter;
    } 
  
    // This function prints the longest 
    // palindrome substring of str[]. 
    // It also returns the length of the 
    // longest palindrome 
    static int longestPalSubstr(String str) 
    { 
        // get length of input string 
        int n = str.length(); 
  
        // table[i][j] will be false if 
        // substring str[i..j] is not palindrome. 
        // Else table[i][j] will be true 
        boolean table[][] = new boolean[n][n]; 
  
        // All substrings of length 1 are palindromes 
        int maxLength = 1; 
        for (int i = 0; i < n; ++i) 
            table[i][i] = true; 
  
        // check for sub-string of length 2. 
        int start = 0; 
        for (int i = 0; i < n - 1; ++i) { 
            if (str.charAt(i) == str.charAt(i + 1)) { 
                table[i][i + 1] = true; 
                start = i; 
                maxLength = 2; 
            } 
        } 
  
        // Check for lengths greater than 2. 
        // k is length of substring 
        for (int k = 3; k <= n; ++k) { 
  
            // Fix the starting index 
            for (int i = 0; i < n - k + 1; ++i) { 
                // Get the ending index of substring from 
                // starting index i and length k 
                int j = i + k - 1; 
  
                // checking for sub-string from ith index to 
                // jth index iff str.charAt(i+1) to 
                // str.charAt(j-1) is a palindrome 
                if (table[i + 1][j - 1] 
                    && str.charAt(i) == str.charAt(j)) { 
                    table[i][j] = true; 
  
                    if (k > maxLength) { 
                        start = i; 
                        maxLength = k; 
                    } 
                } 
            } 
        } 
        System.out.print("Longest palindrome substring is; "); 
        maxLength = printSubStr(str, table); 
  
        // return length of LPS 
        return maxLength; 
    } 
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		  String str = "forgeeksskeegfor"; 
	      System.out.println("Length is: " + longestPalSubstr(str));
		  System.out.println("Count substrings is: " + countSubstrings(str));

	}
	
	 public static int countSubstrings(String s) {
	        if (s == null || s.length() == 0) {
	            return 0;
	        }
	        int result = 0;
	        for (int i = 0; i < s.length(); i++) {
	            result += helper(s, i, i);
	            result += helper(s, i, i + 1);
	        }
	        return result;
	    }
	    private static int helper(String s, int start, int end) {
	        int count = 0;
	        while (start >= 0 && end < s.length()) {
	            if (s.charAt(start) != s.charAt(end)) {
	                break;
	            }
	            count++;
	            start--;
	            end++;
	        }
	        return count;
	    }

}
