package com.star.javabasicprograms;

import java.util.Scanner;

public class CopyOneArrayIntoAnotherArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] a={10,20,30,40,50};
		int size=a.length;
		int i=0;
		int[] b=new int[size];
		while(i!=size)
		{
			b[i]=a[i];
			i++;
		}
		for(int j=0;j<b.length;j++)
		{
			System.out.print(b[j]+" ");
		}

	}

}
