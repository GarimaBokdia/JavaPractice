package com.prep.GoldmanSachs;

public class LongestCommonSubsequenceDP {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LongestCommonSubsequenceDP lcs = new LongestCommonSubsequenceDP();
		String s1 = "GXTXAYB"; 
		String s2 = "AGGTAB"; 
		char[] sr1 = s1.toCharArray();
		char sr2[] = s2.toCharArray();
		
		int res = lcs.lengthLongestComSubsequence(sr1,sr2,sr1.length,sr2.length);
		System.out.println("Length of LCS is "+res);
	}
	
	public int lengthLongestComSubsequence(char[] s1,char[] s2,int sl1,int sl2)
	{
		int lcs[][]= new int[sl1+1][sl2+1];
		//
		for(int i=0;i<=sl1;i++)
		{
			for(int j=0;j<=sl2;j++)
			{
				if(i==0 || j==0)
				{
					lcs[i][j]=0;
				}//Left matches top element : S1 is an array its values are starting from index 0 , for example her
				//s1 can be GXTXAYB, and s2 =AGGTAB 
				else if(s1[i-1] == s2[j-1])
				{
					lcs[i][j]=lcs[i-1][j-1]+1;
				}
				else
				{
					lcs[i][j]=max(lcs[i-1][j],lcs[i][j-1]);
				}
			}
		}
		
		 // Following code is used to print LCS 
		int index = lcs[sl1][sl2];
		
		// Create a character array to store the lcs string 
		char[] lcsOutput = new char[index+1];

        // Start from the right-most-bottom-most corner and 
        // one by one store characters in lcs[] 
		int m=sl1,n=sl2;
		while(m>0 && n>0)
		{
			System.out.println(s1[m-1]+"   "+s2[n-1]);
			 // If current character in X[] and Y are same, then 
            // current character is part of LCS 
			if(s1[m-1]== s2[n-1])
			{
				lcsOutput[index-1]=s1[m-1];
				m--;
				n--;
				index--;
			} // If not same, then find the larger of two and go in the direction of larger value 
			else if(lcs[m-1][n]>lcs[m][n-1])
			{
				m--;
			}
			else
			{
				n--;
			}
		}
		//Print till 4 elements i.e. lcs[sl1][sl2]
		
		for(int i=0;i<lcs[sl1][sl2];i++)
		{
			System.out.print(lcsOutput[i]+" ");
		}
		
		
		return lcs[sl1][sl2];
	}

	  int max(int a, int b) 
	  { 
	    return (a > b)? a : b; 
	  } 
}
