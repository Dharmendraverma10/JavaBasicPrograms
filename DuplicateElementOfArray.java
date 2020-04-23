package com.star.javabasicprograms;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class DuplicateElementOfArray {

	public static void main(String[] args) {

		int[] a={10,20,30,40,10,20,50,40,70,80};
		int size=a.length;
		int i=0;
		Map<Integer,Integer> map=new TreeMap<>();
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
				map.put(a[i],newval);
			}
			i++;
		}
		Set<Entry<Integer, Integer>> tmap = map.entrySet();
		for(int data:a)
		{
			System.out.print(data+" ");
		}
		System.out.println();
		for(Entry<Integer,Integer> data:tmap)
		{
			if(data.getValue()>1)
			{
				System.out.print(data.getKey()+" ");
			}
		}
	}

}
