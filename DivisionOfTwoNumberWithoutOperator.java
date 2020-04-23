package com.star.javabasicprograms;

import java.util.Scanner;

public class DivisionOfTwoNumberWithoutOperator {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of a ");
		int a=sc.nextInt();
		System.out.println("Enter value of b ");
		int b=sc.nextInt();
		int que=0;
		if(b==0)
		{
			System.out.println("Error! Division by zero");
			System.exit(0);
		}
		int sign=1;
		if(a*b<0)
		{
			sign=-1;
		}
		a=Math.abs(a);
		b=Math.abs(b);
		while(a>=b)
		{
			a=a-b;
			que++;
		}
		int rem=a;
		System.out.println("Quotient : "+que*sign);
		System.out.println("Remainder : "+rem);
	}

}
