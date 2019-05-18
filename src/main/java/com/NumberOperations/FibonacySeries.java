package com.NumberOperations;

public class FibonacySeries {
	
	public String Fibonaci(String input)
	{
		int start=0;
		int next=1;
		String series="";
		if(Integer.parseInt(input)>2)
		{
			series="0,1";
			for(int i=0;i<Integer.parseInt(input)-2;i++)
			{
				int temp=start;
				start=next;
				next=next+temp;
				series+=","+next+"";
			}
		}
		else {
			if(Integer.parseInt(input)==2)
			{
				series="0,1";
			}
			else
			{
				series="0";
			}
		}
		return series;
	}

}
