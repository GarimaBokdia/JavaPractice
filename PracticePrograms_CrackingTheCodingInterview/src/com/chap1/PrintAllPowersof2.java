package com.chap1;

public class PrintAllPowersof2 {

	int powersOf2(int num)
	{
		if(num == 0)
			return num;
		if(num == 1)
		{
			System.out.println(num);
			return num;
		}
		else
		{
			int begin  = powersOf2(num/2);
			int powNum = begin*2;
			System.out.println(powNum);
			return num;
		}
	}
	public static void main(String[] args) {
		PrintAllPowersof2 printPow2= new PrintAllPowersof2();
		printPow2.powersOf2(1025);
	}

}
