package com.star.javabasicprograms;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		String b=sc.nextLine();
		
		a=a.toLowerCase();
		b=b.toLowerCase();
		
		
		char[] x=a.toCharArray();
		char[] y=b.toCharArray();
		
		int sizeOfx=x.length;
		int sizeOfy=y.length;
		
		if(sizeOfx!=sizeOfy)
		{
			System.out.println("Not an Anagram");
			System.exit(0);
		}
		else
		{
			for(int i=0;i<sizeOfx;i++)
			{
				for(int j=0;j<sizeOfx-1-i;j++)
				{
					if(x[j]>x[j+1])
					{
						char temp=x[j];
						x[j]=x[j+1];
						x[j+1]=temp;
					}
				}
			}
			
			for(int i=0;i<sizeOfx;i++)
			{
				for(int j=0;j<sizeOfx-1-i;j++)
				{
					if(y[j]>y[j+1])
					{
						char temp=y[j];
						y[j]=y[j+1];
						y[j+1]=temp;
					}
				}
			}
			int i=0;
			while(i!=sizeOfx)
			{
				if(x[i]!=y[i])
				{
					System.out.println("Not an anagram");
					System.exit(0);
				}
				else
				{
					i++;
				}
			}
			System.out.println("Anagram");
		}

	}

}
