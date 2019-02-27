package com.stringOperation;

public class swapStringWithoutusingThirdVar 
{
	public String[] swap(String[] strs)
	{
		String [] d=new String[2];
		d[0]=strs[0];
		d[1]=strs[1];
		System.out.println(d[0]+"  before  "+d[1]);
		d[0]=d[0]+d[1];
		d[1]=d[0].substring(0, d[0].indexOf(d[1]));
		d[0]=d[0].replace(d[1], "");
		System.out.println(d[0]+"  after  "+d[1]);
		return d;
	}
}
