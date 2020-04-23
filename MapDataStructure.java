package com.star.javabasicprograms;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MapDataStructure {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String s = sc.nextLine();
		Map<Character,Integer> map=new LinkedHashMap<>();
		char[] a=s.toCharArray();
		int size=a.length;
		int i=0;
		while(i!=size)
		{
			if(map.containsKey(a[i])==false)
			{
				map.put(a[i], 1);
			}
			else
			{
				int oldval=map.get(a[i]);
				int newval=oldval+1;
				map.put(a[i], newval);
			}
			i++;
		}
		
		Set<Entry<Character, Integer>> hmap = map.entrySet();
		for(Entry<Character,Integer> data:hmap)
		{
			if(data.getValue()>1)
			{
				System.out.println(data.getKey()+"  "+data.getValue());
			}
			
		}
		
	}

}
