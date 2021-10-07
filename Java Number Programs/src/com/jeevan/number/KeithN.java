package com.jeevan.number;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class KeithN {
//19 = 1+9 = 10, 10+9 = 19 (19=19)
	public void Keith_or_not(int x) {
		ArrayList<Integer> terms = new ArrayList<Integer>();
		int length=0;
		int num = x;
		while(num>0) {
			terms.add(num%10);
			num=num/10;
			length++;
		}
		Collections.reverse(terms);//reverse the terms
		//System.out.println(length);
		int next_term = 0,i = length;
		while(next_term<x) {
			next_term = 0;
		for(int j=1;j<=length;j++) {
			next_term = next_term+terms.get(i-j);
		}
		terms.add(next_term);
		i++;
		}
		//System.out.println(next_term);
		if(next_term == x) {
			System.out.println(x+" is Keith number");
		}
		else {
			System.out.println(x+" is not a keith number");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KeithN k = new KeithN();
		System.out.print("Enter number:");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		k.Keith_or_not(n);
		s.close();

	}

}
