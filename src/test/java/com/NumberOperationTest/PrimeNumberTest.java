package com.NumberOperationTest;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.NumberOperations.PrimeNumber;

public class PrimeNumberTest 
{
	@DataProvider
	public String[][] data()
	{
		String[][] info=
			{{"1","false"},{"3","true"},{"101","true"},{"110","false"},{"88","false"},{"0","false"}};
		
		return info;
	}
	
	@Test(dataProvider="data")
	public void PrimeTest(String input,String output)
	{
		PrimeNumber obj=new PrimeNumber();
		Assert.assertEquals(obj.primeNumbers(input), output);
	}
}

