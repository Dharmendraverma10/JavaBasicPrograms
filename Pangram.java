package com.star.javabasicprograms;

import java.util.Scanner;

public class Pangram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		s=s.toUpperCase();
		s=s.replace(" ", "");
		char[] a=s.toCharArray();
		boolean[] b=new boolean[26];
		int size=a.length;
		int i=0;
		while(i!=size)
		{
			int index=a[i]-65;
			b[index]=true;
			i++;
		}

		int j=0;
		while(j!=26)
		{
			if(b[j]==true)
			{
				j++;
			}
			else
			{
				System.out.println("Not a pangram");
				System.exit(0);
			}
		}
		System.out.println("Pangram");
	}

}
