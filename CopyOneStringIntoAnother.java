package com.star.javabasicprograms;

import java.util.Scanner;

public class CopyOneStringIntoAnother {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char a[]=s.toCharArray();
		int size=a.length;
		char b[]=new char[size];
		int i=0;
		while(i!=size)
		{
			b[i]=a[i];
			i++;
		}
		System.out.println(a);
		System.out.println(b);

	}

}
