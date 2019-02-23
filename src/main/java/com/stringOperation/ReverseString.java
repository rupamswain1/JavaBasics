package com.stringOperation;

public class ReverseString {

	public static String reverse(String text)
	{
		String revers="";
		for(int i=text.length()-1;i>=0;i--)
		{
			revers=revers+text.charAt(i);
		}
		return revers;
	}
	
	//second method
	public static String reverseBuildder(String text)
	{
		String reverse="";
		StringBuilder str=new StringBuilder(text);
		reverse=new String(str.reverse());
		return reverse;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text="My name is Rupam";
		System.out.println(reverse(text));
		System.out.println(reverseBuildder(text));
	}

}
