package com.prep.GoldmanSachs;

public class LargetLexographicalSubsrting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "";
		//Failed for very large input
		lastSubstring(s);

	}
	public static String lastSubstring(String s) {
        String last="";
        
        for(int i=0;i<s.length();i++)
        {
            if(last.compareTo(s.substring(i))<=0)
                last=s.substring(i);
            
        }
    return last;
    }
}
