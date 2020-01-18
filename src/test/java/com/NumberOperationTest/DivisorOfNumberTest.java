package com.NumberOperationTest;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.NumberOperations.DivisorOfNumber;

public class DivisorOfNumberTest 
{
	@DataProvider
	public String[][] dataprovider()
	{
		String [][] data=
			{{"10","1,2,5,10"},{"12","1,2,3,4,6,12"},{"9","1,3,9"}};
		
		return data;
	}
	
	@Test(dataProvider="dataprovider",groups= {"Number"})
	public void divisorTest(String input, String output)
	{
		DivisorOfNumber obj=new DivisorOfNumber();
		String op="";
		for(String s:obj.findDivisor(input))
		{
			op=op+s+",";
		}
		op=op.substring(0, op.length()-1);
		Assert.assertEquals(op, output);
	}
	
}
