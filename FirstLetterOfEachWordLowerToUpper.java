package com.star.javabasicprograms;

import java.util.Scanner;

public class FirstLetterOfEachWordLowerToUpper {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char[] a=s.toCharArray();
		int size=a.length;
		int i=1;
		a[0]=(char)(a[0]-32);
		while(i!=size)
		{
			if(a[i]==' ')
			{
				a[i+1]=(char)(a[i+1]-32);
			}
			i++;
		}
		System.out.println(a);

	}

}
