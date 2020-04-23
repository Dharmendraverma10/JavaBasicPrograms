package com.star.javabasicprograms;

public class MergeTwoArrays {

	public static void main(String[] args) {
		int a[]={1,2,3,4,5,55,56,57};
		int b[]={6,7,8,9,10,11,12,13};
		int size1=a.length;
		int size2=b.length;
		int totalsize=size1+size2;
		int c[]=new int[totalsize];
		int index =0;
		for(int i=0;i<size1;i++)
		{
			c[index]=a[i];
			index++;
		}
		for(int i=0;i<size2;i++)
		{
			c[index]=b[i];
			index++;
		}
		System.out.print("Merged Array : ");
		for(int i=0;i<totalsize;i++)
		{
			System.out.print(c[i]+" ");
		}
		
	}

}
