package com.stringOperation.Test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.stringOperation.printDuplicateCount;

public class printDuplicateCountTest {
	
	
	@Test(dataProvider="dp")
	public void TestDuplicate(String input,String output)
	{
		printDuplicateCount run=new printDuplicateCount();
		assertEquals(run.duplicate(input), output);
	}
	

	@DataProvider(name="dp")
	public String[][] data()
	{
		String[][] input= {{"my name is rupam","a:2,e:1,i:1,m:3,n:1,p:1,r:1,s:1,u:1,y:1,"},
				{"ABCabc123ABC123","1:2,2:2,3:2,A:2,B:2,C:2,a:1,b:1,c:1,"}		
		};
		
		return input;
	}
}
