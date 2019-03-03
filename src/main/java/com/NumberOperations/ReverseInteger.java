package com.NumberOperations;

public class ReverseInteger {
	
	public int Reverse(int number)
	{
		int temp=number;
		int rev=0;
		while(temp!=0)
		{
			int a=temp%10;
			temp=temp/10;
			rev=rev*10+a;
		}
		return rev;
	}

}
