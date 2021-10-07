package com.jeevan.number;

import java.util.Scanner;

public class AlternatePrimeN {
	public boolean checkPrime(int num) {
		int count=0;
		for(int i=2;i<=num;i++) {
			if(num%i==0) {
				count = count+1;
			}	
		}
		if(count==1) {
			return true;
		}
		return false;
	}
	
	public void Primes(int n) {
		int value=1;
		System.out.println("First "+n+" prime numbers are :");
		int i = 2;
		 while(value<=n) {
			 
			//System.out.println(i+" "+checkPrime(i));
			if(checkPrime(i)==true) {
				System.out.println(i);
				value =value+1;
			}
			i++;
			}
		}
			public void AlterPrimes(int n) {
				int value=1;
				System.out.println("Alternate prime numbers are :");
				int i = 2;
				 while(value<=n) {
					 //System.out.println(i+" "+checkPrime(i));
					if(checkPrime(i)==true) {
						if(value%2==1) {
						System.out.println(i);}
						value =value+1;
					}
					i++;
					}				
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlternatePrimeN a = new AlternatePrimeN();
		System.out.printf("Enter value: ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		if(a.checkPrime(x)) {
			System.out.println(x+" is Prime Number");
		}
		else
		{
			System.out.println(x+" is not Prime Number");
		}
		a.Primes(x);
		a.AlterPrimes(x);
		sc.close();
	}

}
