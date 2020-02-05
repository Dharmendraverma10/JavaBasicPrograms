package com.star.javabasicprograms;

import java.util.Scanner;

public class StringContainsOnlyInteger {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char[] a=s.toCharArray();
		int size=a.length;
		int i=0;
		while(i!=size)
		{
			if(a[i]>='0' && a[i]<='9')
			{
				System.out.println("String contain Integer");
				System.exit(0);
			}
			i++;
		}
		System.out.println("String Does not contain Integers");
	}

}
