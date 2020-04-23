package com.star.javabasicprograms;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int bin_num[]=new int[100];
		int i=1,j;
		while(num!=0)
		{
			bin_num[i++]=num%2;
			num=num/2;
		}
		System.out.println("Binary Number is:");
		for(j=i-1;j>0;j--)
		{
			System.out.print(bin_num[j]);
		}

	}

}
