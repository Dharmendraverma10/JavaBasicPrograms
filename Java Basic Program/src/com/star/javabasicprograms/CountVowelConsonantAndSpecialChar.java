package com.star.javabasicprograms;

import java.util.Scanner;

public class CountVowelConsonantAndSpecialChar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char[] a=s.toCharArray();
		int size=a.length;
		int i=0;
		int vowel=0;
		int cons=0;
		int specialchar=0;
		while(i!=size)
		{
			if(a[i]>='a'&& a[i]<='z' || a[i]>='A'&&a[i]<='Z')
			{
				if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u'||a[i]=='A'||a[i]=='E'||a[i]=='I'||a[i]=='O'||a[i]=='U')
				{
					vowel++;
				}
				else
				{
					cons++;
				}
			}
			else
			{
				specialchar++;
			}
			i++;
		}
		System.out.println("Vowels = "+vowel);
		System.out.println("Consonant = "+cons);
		System.out.println("Special Character = "+specialchar);

	}

}
