package com.stringOperation.Test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

import com.stringOperation.swapStringWithoutusingThirdVar;

public class NewTest {
  static swapStringWithoutusingThirdVar obj=null;
  @BeforeMethod
  public void beforeMethod() {
	  obj=new swapStringWithoutusingThirdVar();
  }

  @Test(dataProvider = "dp")
  public void f(String a, String b) {
	  String[] pass=new String[2];
	  pass[0]=a;
	  pass[1]=b;
	  String[] res=obj.swap(pass);
	  Assert.assertEquals(res[0].equals(b) && res[1].equals(a), true);
  }
  
  
  @AfterMethod
  public void afterMethod() {
	  obj=null;
  }


  @DataProvider
  public String[][] dp() {
    String[][] data={{"a","b"},
    		{"abc","pqr"},
    		{"Hellow","world"}};
    
    return data;
  }
}
