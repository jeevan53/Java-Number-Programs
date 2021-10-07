package com.jeevan.number;

import java.util.Scanner;

public class Largestof3N {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter three numbers: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int lar = 0;
		lar = a>b?a:b; //Ternary operator
		lar = lar>c?lar:c;
		int sma = 0;
		sma = a<b?a:b; //Ternary operator
		sma = sma<c?sma:c;
		System.out.println("Largest number is "+lar);
		System.out.println("Largest number is "+sma);
		sc.close();
	}

}
