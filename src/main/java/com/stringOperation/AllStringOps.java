package com.stringOperation;

import java.util.Arrays;
import java.util.List;

public class AllStringOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="HowAreYouBros";
		System.out.println("length of string="+str.length());
		System.out.println("**************");
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			System.out.println(Character.isUpperCase(c));
			System.out.println("Charater at index "+i+" is "+str.charAt(i));
		}
		System.out.println("*************");
		//CompareTo() operation
		
		System.out.println("abc".compareTo("ABC"));
		System.out.println("abc".compareTo("pqr"));
		System.out.println("pqr".compareTo("abc"));
		System.out.println("abc".compareTo("abc"));
		
		//Concat()
		System.out.println("abc".concat("pqr"));
		
		//containtEquals()
		System.out.println("*************");
		System.out.println("abc".contentEquals(new StringBuffer("abc")));
		System.out.println("abc".contentEquals(new StringBuffer("abc ")));
		System.out.println("abc".contentEquals(new StringBuffer("ABC")));
		
		//copyValueOf()
		char[] chr={'h','e','l','l','o',' ','w','o','r','l','d'};
		System.out.println("".copyValueOf(chr));
		System.out.println("".copyValueOf(chr,2,5));
		
		//indexOf
		System.out.println("****************");
		System.out.println("abc".indexOf("b"));
		System.out.println("abcabc".indexOf("a",1));
		System.out.println("abcabc".indexOf("abc",1));
		
		//replace
		System.out.println("****************");
		System.out.println("abcabc".replace("a","e"));
		System.out.println("abc".replaceAll("[a-z]","[A-Z]"));
		
		//join list content to form string
		System.out.println("****************");
		List<String> list=Arrays.asList("This","is", "a", "List");
		System.out.println(String.join(" ", list));
		
	}

}
