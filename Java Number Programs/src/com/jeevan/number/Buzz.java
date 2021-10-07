package com.jeevan.number;

public class Buzz {
	/*
	 42 is a Buzz number because it is divisible by 7.
107 is a Buzz number because it ends with 7.
147 is a Buzz number because it ends with 7 and also divisible by 7.
134 is not a Buzz number because it is neither end with 7 nor divisible by 7.
	 */
	
	public void buzz_or_not(int n) {
		if(n%10==7 || n/7==0) {
			System.out.println(n+" is a Buzz Number");
		}
		else {
			System.out.println(n+" is not a Buzz Number");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buzz b = new Buzz();
		b.buzz_or_not(42);
		b.buzz_or_not(107);
		b.buzz_or_not(51);
		b.buzz_or_not(147);
		b.buzz_or_not(134);
	}

}
