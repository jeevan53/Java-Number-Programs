package com.jeevan.number;

import java.util.Scanner;

public class ReverseNumber {
	
	public static int reverse(int n) {
		int rev = 0;
		int r;
		while(n>0) {
			r = n%10;
			rev = (rev*10)+r;
			n = n/10;
		}
		return rev;
	}
	public static void main(String[] args) {
		System.out.println("Enter Number:");
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			sc.close();
			System.out.println("Reverse of given number: "+reverse(n));
			
	}
}
