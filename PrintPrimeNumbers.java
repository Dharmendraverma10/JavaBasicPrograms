package com.star.javabasicprograms;

import java.util.Scanner;

public class PrintPrimeNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Number of terms");
		int n=sc.nextInt();
		int status=1,x=3,count,j;
		if(n>=1)
		{
			System.out.print(2+" ");
		}
		for(count=2;count<=n;)
		{
			for(j=2;j<=Math.sqrt(x);j++)
			{
				if(x%2==0)
				{
					status=0;
					break;
				}
			}
			if(status!=0)
			{
				System.out.print(x+" ");
				count++;
			}
			status=1;
			x++;
		}
	}

}
