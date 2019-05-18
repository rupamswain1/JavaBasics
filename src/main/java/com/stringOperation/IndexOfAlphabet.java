package com.stringOperation;

public class IndexOfAlphabet {
	
	//Find index of given alphabet
	public String findIndex(char input)
	{
		int startIndex=(int)Character.toLowerCase('A');
		int inputIndex=(int)Character.toLowerCase(input);
		
		int index=inputIndex-startIndex;
		return index+1+"";
	}

	
}
