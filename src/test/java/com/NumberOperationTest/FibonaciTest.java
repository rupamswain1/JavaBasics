package com.NumberOperationTest;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.NumberOperations.FibonacySeries;

public class FibonaciTest {

	@DataProvider
	public String[][] data()
	{
		String[][] d=
			{{"0","0"},{"2","0,1"},{"5","0,1,1,2,3"},{"7","0,1,1,2,3,5,8"}};
		return d;
	}
	
	@Test(dataProvider="data")
	public void res(String input,String output)
	{
		FibonacySeries f=new FibonacySeries();
		Assert.assertEquals(f.Fibonaci(input), output);
	}
}
