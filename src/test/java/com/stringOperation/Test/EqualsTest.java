package com.stringOperation.Test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

import com.stringOperation.Equals;

public class EqualsTest {
	
	Equals obj=null;
	
  @BeforeMethod
  public void init()
  {
	  obj=new Equals();
  }
	
  @Test(dataProvider = "dp")
  public void equalsMethodTest(String n, String s) 
  {
	  boolean res=obj.equalsMethod(n, s);
	  Assert.assertEquals(res, true);
  }
  
  @Test(dataProvider = "dp")
  public void equalsOperatorTest(String n, String s) 
  {
	  boolean res=obj.equalsOperator(n, s);
	  Assert.assertEquals(res, n==s);
  }

  @DataProvider
  public String[][] dp() {
	  String a=new String("pqr");
	  String b=a;
	  String[][] data={{"abc","abc"},{new String("abc"),new String("abc")},{a,b}};
	  
    return data;
  }
  
  @AfterMethod
  public void end()
  {
	  obj=null;
  }
}
