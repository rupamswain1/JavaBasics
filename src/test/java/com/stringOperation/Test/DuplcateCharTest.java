package com.stringOperation.Test;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.stringOperation.DuplicateChar;

public class DuplcateCharTest {
	
	static DuplicateChar obj=null;
	@BeforeMethod
	public void initz()
	{
		obj=new DuplicateChar();
		
	}
	
	@Test(dataProvider="dp" , groups= {"String"})
	public void checkDuplicate(String input, String output)
	{
		Assert.assertEquals(obj.duplicate(input), output);
	}
	
	@Test(dataProvider="dpHash")
	public void HashMethodDuplicate(String input, String output)
	{
		Assert.assertEquals(obj.duplicateHashSet(input), output);
	}
	
	@DataProvider
	public String[][] dp()
	{
		String[][] ip={{"Hello","l"},{"hey what are you doing?","hey ao"}
		};
		return ip;
				
	}
	@DataProvider
	public String[][] dpHash()
	{
		String[][] ip={{"Hello","l"},{"hey what are you doing?","h ae y o"}
		};
		return ip;
				
	}
	
	@AfterMethod
	public void destroy()
	{
		obj=null;
	}

}
