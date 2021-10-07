package com.jeevan.number;

import java.util.Scanner;

public class NthPrime {
	
	public void nprime(int n) {
		int num = 1,count = 0,i;
		while(count<n) {
			num = num+1;
			for(i=2;i<=num;i++) {
				if(num%i==0) {
					break;
				}
			}
			if(i==num) {
				count = count+1;
			}
		}
		System.out.println("The "+n+"th prime number is: "+num);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter value:");
		NthPrime n = new NthPrime();
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		n.nprime(a);
		sc.close();
		
		
	}

}
