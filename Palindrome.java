package com.star.javabasicprograms;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		s=s.toLowerCase();
		s=s.replace(" ","");
		char[] a=s.toCharArray();
		int size=a.length;
		char[] b=new char[size];
		int i=0;
		while(i!=size)
		{
			b[size-1-i]=a[i];
			i++;
		}
		int j=0;
		while(j!=size)
		{
			if(a[j]!=b[j])
			{
				System.out.println("Not a Palindrome");
				System.exit(0);
			}
			else
			{
				j++;
			}
		}
		System.out.println("Palindrome");

	}

}
