package com.NumberOperationTest;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.NumberOperations.ReverseInteger;

public class ReverseIntegerTest 
{
	static ReverseInteger obj=null;
	@BeforeMethod
	public void init()
	{
		obj=new ReverseInteger();
	}
	
	@Test(dataProvider="dp")
	public void ReverseTest(int input, int output)
	{
		Assert.assertEquals(obj.Reverse(input), output);
	}
	
	@DataProvider
	public String[][] dp()
	{
		String[][] data={{"123","321"},{"75315987","78951357"}};
		return data;
	}
	
	@AfterMethod
	public void dest()
	{
		obj=null;
	}
}
