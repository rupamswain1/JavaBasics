package com.stringOperation.Test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.internal.ExpectedExceptionsHolder;

import com.stringOperation.ReverseString;

public class ReverseStringTest {
	static ReverseString obj=null;
	@BeforeSuite
	public void suit()
	{
		System.out.println("Test suit execution started");
	}
	
	@BeforeTest
	public void test()
	{
		System.out.println("Reverse String operation Test");
	}
	@BeforeClass
	public void cls()
	{
		System.out.println("Class");
	}
	
	@BeforeMethod
	public void objIntialise()
	{
		obj=new ReverseString();
	}
	
	@Test(dataProvider="TestData")
	public void ReversestringTest(String input, String expectedOutput)
	{
		String result=obj.reverse(input);
		Assert.assertEquals(expectedOutput, result);
	}
	
	@Test(dataProvider="TestData")
	public void ReverseStringbuilderTest(String input, String expectedOutput)
	{
		System.out.println(expectedOutput);
		String result=obj.reverse(input);
		Assert.assertEquals(expectedOutput, result);
	}
	
	@DataProvider
	public String[][] TestData()
	{
		String[][] data={{"abc","cba"},
				{"hello world","dlrow olleh"},
				{"Hi how are you","uoy era woh iH"},
				{"ABCD "," DCBA"},
				{"12345","054321"}};
		return data;
	}
	
	@AfterMethod
	public void destroy()
	{
		obj=null;
	}
}
