package com.NumberOperations;

public class PrimeNumber 
{
	public String primeNumbers(String input)
	{
		int num=Integer.parseInt(input);
		if((num+"").equals("1") || (num+"").equals("0"))
		{
			return "false";
		}
		for(int i=2;i<=num/2;i++)
		{
			
			if(num%i==0)
			{
				return "false";
			}
			
				
		}
		return "true";	
	}
}
