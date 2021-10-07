package com.jeevan.number;

public class Emirp {
	//79 = 97 = both prime it is Emirp N
	//19 = 91 = one is prime , rev not prime so it is not Emirp N
	public boolean isPrime(int x) {
		int count =0;
		for(int i = 1;i<x;i++) {
			if(x%i==0) {
				count++;
			}
		}
			if(count<=1) {
				return true;
			}
			else
			{
				return false;
			}
	}
	
	public void EmirpN_or_not(int n) {
		int num = n;
		int rev=0,r;
		while(num>0) {
			r = num%10;
			rev = (rev*10)+r;
			num = num/10;
		}
		if(isPrime(n)==isPrime(rev)) {
			System.out.println(n+" is a Emirp Number");
		}
		else {
			System.out.println(n+" is not a Emirp Number");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emirp e = new Emirp();
		//System.out.println(e.isPrime(19));
		e.EmirpN_or_not(79);
		e.EmirpN_or_not(17);
	}

}
