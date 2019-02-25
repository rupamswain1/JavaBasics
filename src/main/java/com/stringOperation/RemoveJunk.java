package com.stringOperation;

public class RemoveJunk {
	
	public String charAtmethod(String input)
	{
		String result="";
		String junk="@#$%^&*()_+.";
		for(int i=0; i<input.length();i++)
		{
			if(junk.contains(input.charAt(i)+""))
			{
				continue;
			}
			else
			{
				result=result+input.charAt(i);
			}
		}
		return result;
	}
	
	public String replaceMethod(String input)
	{
		String result="";
		result=input.replaceAll("[^a-zA-Z0-9\\s]","");
		
		return result;
	}

}