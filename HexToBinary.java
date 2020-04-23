package com.star.javabasicprograms;

import java.util.Scanner;

public class HexToBinary {

	public static int hex_to_dec(String s)
	{
		String digits="0123456789ABCDEF";
		s=s.toUpperCase();
		int val=0;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			int d=digits.indexOf(c);
			val=16*val+d;
		}
		return val;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Hexadecimal Number");
		String hex_dec=sc.nextLine();
		int dec_num=hex_to_dec(hex_dec);
		int i=1,j;
		int bin_num[]=new int[100];
		while(dec_num!=0)
		{
			bin_num[i++]=dec_num%2;
			dec_num=dec_num/2;
		}
		System.out.println("Binary Number is:");
		for(j=i-1;j>0;j--)
		{
			System.out.print(bin_num[j]);
		}
	}

}
