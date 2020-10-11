package com.prep.GoldmanSachs;

public class Atoi {

    public static int myAtoi(String s) {
       long res=0;
        //str is empty or it contains only whitespace characters, no conversion is performed
        if(s.length()==0)
            return (int)res;
        
        //The function first discards as many whitespace characters as necessary until the first non-whitespace character is found.
        s = s.trim();
        
        if(s.isEmpty())
        return (int)res;
                
        //character takes an optional initial plus or minus sign followed
        int sign = 1 ; //Assuming by default +
        int pos=0; //index pos to iterate through the string
        
        if(s.charAt(pos)=='-') /*If first char */
        {
            sign = -1; //Sign is negative
            pos++; //iterate from numbers beginning
        }
        else if(s.charAt(pos)=='+') /*If first char */
        {
            sign = 1; //Sign is positive
            pos++; //iterate from numbers beginning
        }
        
        while(pos<s.length())
        {
            if(Character.isDigit(s.charAt(pos)))
            {
            	if (res > Integer.MAX_VALUE / 10 ||
                        (res == Integer.MAX_VALUE / 10 && s.charAt(pos) - '0' > Integer.MAX_VALUE % 10)) {
                    return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
                res = res*10 + Character.getNumericValue(s.charAt(pos));
            }
            else
            {
            	break;
            }
            pos++;
        }
        
        
       	
        	
        return (int)(sign*res);
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str="";
		str="42";
		System.out.println("Output : "+str+" : "+ myAtoi(str));
		 str="  -42";
		System.out.println("Output : "+str+" : "+ myAtoi(str));
		 str="+1";
		System.out.println("Output : "+str+" : "+ myAtoi(str));
		 str="4193 with words";
		System.out.println("Output : "+str+" : "+ myAtoi(str));
		 str="words and 987";
		System.out.println("Output : "+str+" : "+ myAtoi(str));
		 str="-91283472332";
		System.out.println("Output : "+str+" : "+ myAtoi(str));
		str = "-2147483647";
		System.out.println("Output : "+str+" : "+ myAtoi(str));
		str = "18446744073709551617";
		System.out.println("Output : "+str+" : "+ myAtoi(str));
	}

}
