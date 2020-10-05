package com.practice.stringPrograms;

public class ReverseAString
{
    public static void main(String[] args)
    {
        String blogName = "howtodoinjava.com";
         
        String reverseString = recursiveSwap(blogName);
         
        System.out.println(reverseString);
    }
     
    static String recursiveSwap(String str)
    {
         if ((null == str) || (str.length() <= 1))
         {
                return str;
         }
         return recursiveSwap(str.substring(1)) + str.charAt(0);
    }
}