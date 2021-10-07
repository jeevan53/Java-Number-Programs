package com.jeevan.number;

import java.util.Scanner;

public class DuckN {
	/*
	 3210 is a Duck number because it contains zero at the end of the number but not present at the beginning of it.
08237 is not a Duck number because it contains zero at the beginning of it.
7033 is a Duck number because it contains zero at the second position, not at the beginning.
030405 is a Duck number because it also contains zero in starting of the number.
00153 is also not a Duck number because it contains leading zeros.
	 */
	public boolean Duck_or_not(int n) {
		while(n!=0) {
			
			if(n%10==0) {
				return true;
				
			}
			n = n/10;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DuckN d = new DuckN();
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3 = sc.nextInt();
		if(d.Duck_or_not(n)) {
			System.out.println(n+" is Duck Number");
		}
		else {
			System.out.println(n+" is Not Duck Number");
		}
		if(d.Duck_or_not(n1)) {
			System.out.println(n1+" is Duck Number");
		}
		else {
			System.out.println(n1+" is Not Duck Number");
		}
		if(d.Duck_or_not(n2)) {
			System.out.println(n2+" is Duck Number");
		}
		else {
			System.out.println(n2+" is Not Duck Number");
		}
		if(d.Duck_or_not(n3)) {
			System.out.println(n3+" is Duck Number");
		}
		else {
			System.out.println(n3+" is Not Duck Number");
		}
		sc.close();
	}

}
