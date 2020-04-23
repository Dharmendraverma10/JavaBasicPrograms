package com.star.javabasicprograms;

import java.util.Scanner;

public class MysteryNumber {
	public static int revNum(int n)
	{
		int sum=0;
		while(n!=0)
		{
			int rem=n%10;
			sum=(sum*10)+rem;
			n=n/10;
		}
		return sum;
	}
	public static boolean isMystery(int n)
	{
		for(int i=1;i<=n/2;i++)
		{
			int j=revNum(i);
			if(i+j==n)
			{
				System.out.println(i+"  "+j);
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(isMystery(n)==false)
		{
			System.out.println("Not a mystery number");
		}

	}

}
