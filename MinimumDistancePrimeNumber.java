package com.star.javabasicprograms;

import java.util.Scanner;

public class MinimumDistancePrimeNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sc.nextInt();
		int count,a=0,b=0,c=0;
		for(int i=2;i<=n*n;i++)
		{
			count = 0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				
				if(b==n)
				{
					break;
				}
				a=b;
				b=c;
				c=i;
			}
			
		}
		int d1=b-a;
		int d2=c-b;
		if(d1<d2)
		{
			System.out.println(a);
		}
		else
		{
			System.out.println(c);
		}
	}

}
