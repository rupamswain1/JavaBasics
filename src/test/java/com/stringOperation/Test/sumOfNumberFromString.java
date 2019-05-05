package com.stringOperation.Test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class sumOfNumberFromString 
{

	@Test(dataProvider="dp")
	public void test(String input,String output)
	{
		com.stringOperation.sumOfNumberFromString obj=new com.stringOperation.sumOfNumberFromString();
		assertEquals(obj.getSum(input)+"", output);
	}
	
	@DataProvider(name="dp")
	public String[][] inputs()
	{
		String[][] ip= {{"A123BCGD","6"},{"sdasdaw45asd5454asdsd5sadas6","38"}};
		return ip;
	}
}
