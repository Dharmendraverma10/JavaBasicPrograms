package com.star.javabasicprograms;

public class LargestElementInArray {

	public static void main(String[] args) {
		int a[]={10,20,60,89,90,89,89,90,56,40,91,91,91,91};
		int max=-999;
		int secondmax=-999;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				secondmax=max;
				max=a[i];
			}
		}
		System.out.println("Max: "+max);
		System.out.println("SecondMax: "+secondmax);
	}

}
