package com.star.javabasicprograms;

import java.util.Scanner;

public class Robotics {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter command");
		String s=sc.nextLine();
		s=s.toUpperCase();
		char[] a=s.toCharArray();
		int size=a.length;
		int i=0;
		int up=0 ,down=0 ,left=0,right=0;
		System.out.println("Robot Initial Position : "+(up-down) +" "+(right-left));
		while(i!=size)
		{
			if(a[i]=='U')
			{
				up++;
			}
			else if(a[i]=='D')
			{
				down++;
			}
			else if(a[i]=='L')
			{
				left++;
			}
			else if(a[i]=='R')
			{
				right++;
			}
			i++;
		}
		
		//System.out.println("Robot Position : "+(up-down) +" "+(right-left));
		if((up-down)==0 && (right-left)==0)
		{
			System.out.println("Robot is at their initial position");
		}
		else
		{
			System.out.println("Robot is not in its initial position and position is: X = "+(right-left)+" Y = "+(up-down));
		}
	}

}
