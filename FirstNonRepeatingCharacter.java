package com.star.javabasicprograms;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.nextLine();
		char[] a=s.toCharArray();
		int size=a.length;
		int i=0;
		Map<Character,Integer> map=new LinkedHashMap<>();
		while(i!=size)
		{
			if(map.containsKey(a[i])==false)
			{
				map.put(a[i],1);
			}
			else
			{
				int oldval=map.get(a[i]);
				int newval=oldval+1;
				map.put(a[i], newval);
			}
			i++;
		}
		Set<Entry<Character, Integer>> lhmap = map.entrySet();
		for(Entry<Character,Integer> data:lhmap)
		{
			System.out.println(data.getKey()+"      "+data.getValue());
		}
		System.out.print("First Non repeating character is : ");
		for(Entry<Character,Integer> data:lhmap)
		{
			if(data.getValue()==1)
			{
				System.out.println(data.getKey());
				System.exit(0);
			}
		}
	}

}
