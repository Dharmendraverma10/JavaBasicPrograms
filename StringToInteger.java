package com.star.javabasicprograms;

import java.util.Scanner;

public class StringToInteger {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char[] a=s.toCharArray();
		int size=a.length;
		int i=0;
		int x=0;
		int zeroascii=(int)'0';
		while(i!=size)
		{
			int charascii=(int)a[i];
			x=(x*10)+(charascii-zeroascii);
			i++;
		}
		System.out.println(x);
	}

}
