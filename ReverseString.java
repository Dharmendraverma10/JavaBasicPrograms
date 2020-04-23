package com.star.javabasicprograms;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char a[]=s.toCharArray();
		int size=a.length;
		int i=0;
		char b[]=new char[size];
		while(i!=size)
		{
			b[size-1-i]=a[i];
			i++;
		}
		System.out.println(a);
		System.out.println(b);

	}

}
