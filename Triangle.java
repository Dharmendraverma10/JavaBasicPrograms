package com.star.javabasicprograms;

public class Triangle {

	public static void main(String[] args) {
		int n=5;
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int j=n;j>i;j--)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}

	}

}
