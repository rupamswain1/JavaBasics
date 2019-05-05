package com.stringOperation;

public class sumOfNumberFromString {
	
	public int getSum(String input)
	{
		int sum=0;
		for(int i=0;i<input.length();i++)
		{
			if(Character.isDigit(input.charAt(i)))
			{
				sum+=Integer.parseInt(input.charAt(i)+"");
			}
		}
		
		return sum;
	}

}
