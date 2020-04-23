package com.star.javabasicprograms;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FrequencyOfEachElement {

	public static void main(String[] args) {
		int a[]={1,2,3,4,1,2,3,4,4,5,6,7};
		int size=a.length;
		int i=0;
		Map<Integer,Integer> map=new LinkedHashMap<>();
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
		
		Set<Entry<Integer, Integer>> lhmap = map.entrySet();
		System.out.println("Key"+"    "+"Value");
		for(Entry<Integer,Integer> data:lhmap)
		{
			System.out.println(data.getKey()+"      "+data.getValue());
		}
	}

}
