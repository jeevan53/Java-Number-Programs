package com.jeevan.number;

public class SpyN {
	//sum of digits = product of digits
	public void Spy_or_not(int n) {
		int sum =0;
		int product =1;
		int x = n;
		while(x>0) {
			sum = sum+(x%10);
			product = product*(x%10);
			x=x/10;
		}
		//System.out.println(sum);
		//System.out.println(product);
		if(sum == product) {
			System.out.println(n+" is Spy Number");
		}
		else
		{
			System.out.println(n+" is not a Spy Number");
		}
	}
	
	public static void main(String[] args) {
		SpyN s = new SpyN();
		s.Spy_or_not(1124);
		s.Spy_or_not(217);
		s.Spy_or_not(132);
	}
}
