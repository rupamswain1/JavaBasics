package com.stringOperation.Test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.stringOperation.IndexOfAlphabet;

public class IndexOfAlphabetTest 
{

	@DataProvider
	public String[][] dataProvider()
	{
		String[][] input= {{"A","1"},{"Z","26"},{"I","9"},{"K","11"},{"R","18"}};
		return input;
	}
	
	@Test(dataProvider="dataProvider")
	public void IndexTest(String input, String expectedOutput)
	{
		IndexOfAlphabet obj=new IndexOfAlphabet();
		Assert.assertEquals(obj.findIndex(input.charAt(0)), expectedOutput);
	}
	
}
