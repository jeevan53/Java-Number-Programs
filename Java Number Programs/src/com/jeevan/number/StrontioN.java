package com.jeevan.number;

public class StrontioN {
	//1386 *2 = 
	public void Strontio_or_not(int n) {
		int m=n*2;
		//remove 1000's place
		m = m%1000;
		//remove 1's place
		m= m/10;
		//System.out.println(m/10);
		//System.out.println(m%10);
		if(m/10 == m%10) {
			System.out.println(n+" is Strontio Number");
		}
		else {
			System.out.println(n+" is not a Strontio Number");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StrontioN s = new StrontioN();
		s.Strontio_or_not(1386);
		s.Strontio_or_not(1234);
	}
}
