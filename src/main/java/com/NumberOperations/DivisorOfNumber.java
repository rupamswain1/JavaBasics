package com.NumberOperations;

import java.util.ArrayList;
import java.util.List;

public class DivisorOfNumber {
	
	public List<String> findDivisor(String input)
	{
		int num=Integer.parseInt(input);
		System.out.println(num);
		List<String> res=new ArrayList<String>();
		
		for(int i=1;i<=num/2;i++)
		{
			if(num%i==0)
			{
				res.add(i+"");
			}
		}
		res.add(num+"");
		return res;
	}

}
