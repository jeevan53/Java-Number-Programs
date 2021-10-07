package com.jeevan.number;

import java.util.Scanner;

public class GreatestCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("Enter two numbers: ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int GCD = 0;
		for(int i = 1;i<=x&&i<=y;i++) {
			if(x%i==0&&y%i==0) {
				GCD = i;
			}
		}
		System.out.println("GCD of "+x+" and "+y+" is "+GCD);
		sc.close();
	}

}
