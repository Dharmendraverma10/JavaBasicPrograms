package com.star.javabasicprograms;
import java.util.Scanner;

public class CoinsCounting {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int coin[]={1,2,5};
		for(int i=0;i<coin.length;i++)
		{
			for(int j=0;j<coin.length-1;j++)
			{
				if(coin[j]<coin[j+1])
				{
					int temp=coin[j];
					coin[j]=coin[j+1];
					coin[j+1]=temp;
				}
			}
		}
		System.out.println("Enter Amount");
		int a=sc.nextInt();
		int coinCount[]= new int[coin.length];
		for(int i=0;i<coin.length;i++)
		{
			if(a==0)
			{
				break;
			}
			coinCount[i]=a/coin[i];
			a=a%coin[i];
		}
		
		System.out.println("Number of coins");
		for(int i=0;i<coin.length;i++)
		{
			System.out.println(coin[i]+" = "+coinCount[i]);
		}
		int sum=0;
		for(int i=0;i<coin.length;i++)
		{
			sum=sum+coinCount[i];
		}
		System.out.println("Mininum number of coin: "+sum);

	}

}
