package com.star.javabasicprograms;

import java.util.Scanner;

public class RotateRight {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter How many number you rotate");
		int r=sc.nextInt();
		int a[]={10,20,30,40,50};
		int size=a.length;
		for(int i=0;i<size;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for(int i=0;i<r;i++)
		{
			int temp=a[size-1];
			int j;
			for(j=size-1;j>0;j--)
			{
				a[j]=a[j-1];
			}
			a[j]=temp;
		}
		for(int i=0;i<size;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
