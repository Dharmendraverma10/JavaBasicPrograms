package com.star.javabasicprograms;

import java.util.Scanner;

public class ReplaceSpaceWithMPersendTwenty {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.nextLine();
		//Using Builtin functions
		s=s.trim();
		s=s.replaceAll(" ", "%20");
		System.out.println(s);
	}

}
