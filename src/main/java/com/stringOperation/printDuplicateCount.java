package com.stringOperation;

import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class printDuplicateCount {
	
	public String duplicate(String input)
	{
		Map<Character, Integer> count=new TreeMap<Character,Integer>();
		
		input=input.replaceAll(" ", "");
		out:
		for(int i=0;i<input.length();i++)
		{
			
			int countChar=0;
			char Char=input.charAt(i);
			if(count.containsKey(Char))
			{
				continue out;
			}
			else
			{
				Inner:
					for(int j=i;j<input.length();j++)
					{
						if((Char+"").equals(input.charAt(j)+""))
						{
							countChar++;
						}
						
					}
			count.put((Character)Char, (Integer)countChar);
			
			}
			
		}
		String s="";
		for(Map.Entry<Character, Integer> entry: count.entrySet())
		{
			s+=entry.getKey()+":"+entry.getValue()+",";
		}
		System.out.println(s);
		return s;
	}

}
