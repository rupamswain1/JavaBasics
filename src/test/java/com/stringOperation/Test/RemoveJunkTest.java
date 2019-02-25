package com.stringOperation.Test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

import com.stringOperation.RemoveJunk;

public class RemoveJunkTest {
	
	static RemoveJunk obj=null;
  
  @BeforeMethod
  public void beforeMethod() {
	  obj= new RemoveJunk();
	  
  }
  
  @Test(dataProvider = "dp")
  public void usingcharAT(String Input, String expected) 
  {
	  Assert.assertEquals(obj.charAtmethod(Input), expected);
  }
  @Test(dataProvider = "dp")
  public void usigReplase(String Input, String expected) 
  {
	  Assert.assertEquals(obj.replaceMethod(Input), expected);
  }

  @AfterMethod
  public void afterMethod() {
	  obj=null;
  }


  @DataProvider
  public String[][] dp() {
    String[][] data= {{"He@#$%llo","Hello"},{"My name is $^%%&*^^...ABC","My name is ABC"}, {"#$#%$^&%*%&*$%#% "," "}};
    return data;
  }
}
