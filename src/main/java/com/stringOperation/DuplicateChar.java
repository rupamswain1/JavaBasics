package com.stringOperation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateChar {
	
	public String duplicate(String input)
	{
		String dup="";
		for(int i=0;i<input.length()-1;i++)
		{
			int j=0;
			for(j=(i+1);j<input.length()-1;j++)	
				if(Character.toString(input.charAt(i)).equals(Character.toString(input.charAt(j))))
				{
					System.out.println(input.charAt(i)+ "*****"+dup);
					if(dup.indexOf(input.charAt(i)+"")<0)
					{
						dup=dup+input.charAt(i);
						System.out.println(dup+"1111");
						continue;
					}
									
				}
		
	}
		return dup;
}
	
	public String duplicateHashSet(String input)
	{
		String dup="";
		Set<Character> sort=new HashSet<Character>();
		for(int i=0;i<input.length();i++)
		{
			
			boolean chk=sort.add(input.charAt(i));
			System.out.println("meth2 "+chk+"****"+input.charAt(i));
			if(chk==false)
			{
				dup=dup+input.charAt(i)+"";
			}
		}
		return dup;
	}
}
