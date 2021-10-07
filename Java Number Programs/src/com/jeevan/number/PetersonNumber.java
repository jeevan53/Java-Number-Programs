package com.jeevan.number;

public class PetersonNumber {
	//145 = 1! + 4! + 5!
	//Krishnamurthy number
	public int factorial(int a) {
		if(a==0){
			  return 1;
			  }
			  else{
			  return a*factorial(a-1);
			  }
			 }
	public void Peterson_or_not(int n) {
		int num = n;
		int r,value=0;
		while(num>0) {
			r = num%10;
			value = value + factorial(r);
			num = num/10;
		}
		if(n==value) {
			System.out.println(n+" is Peterson Number");
		}
		else
		{
			System.out.println(n+" is not Peterson Number");
		}
	}
	public static void main(String[] args) {
		PetersonNumber pn = new PetersonNumber();
		pn.Peterson_or_not(145);
		pn.Peterson_or_not(321);
	}
}
