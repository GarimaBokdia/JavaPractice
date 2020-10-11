package com.prep.GoldmanSachs;

public class StringCompression {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		char[] chars = {'a','b','b','b','b','b','b','b','b','b','b','b','b','c'}; 
			//{'a','a','a','b','b','a','a','c'};
			//{'a','b','b','b','b','b','b','b','b','b','b','b','b'};
			//{'a','b','c'};
			//
			//{'a','a','b','b','c','c','c'};
			//{'a','b','b','b','b','b','b','b','b','b','b','b','b'};  
			//{'a','a','a','b','b','a','a'};
		//char[] chars =   {'a'};
		System.out.println("Length "+ compress(chars));
	}
	
	public static int compress(char[] chars) 
	{
		StringBuilder s=new StringBuilder();
	int subseqPointer = 0;
    for(int index=0;index<chars.length;index++)
    {
        //Write in the new array only if we have last char
        //or there is change in the value in array
        if(index+1==chars.length || chars[index] != chars[index+1])
        {
            s.append(chars[subseqPointer]);
            if(index>subseqPointer)
            {
               s.append((index - subseqPointer + 1));
            }
            subseqPointer=index+1;
        }
    }
    
    //Now storing values in char Array
    int i=0;
    for(char c:s.toString().toCharArray())
    {
    	chars[i]=c;
    	i++;
    }
    return s.length();
    }

}
