package com.jeevan.number;

import java.util.Scanner;

public class SwapN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("Enter two values: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Before Swapping: a="+a+" b="+b);
		//swap numbers
	/*	a = a^b;
		b = a^b;
		a = a^b;
		*/
		a = a*b;
		b = a/b;
		a =a/b;
		System.out.println("Before Swapping: a="+a+" b="+b);
		sc.close();
	}

}
