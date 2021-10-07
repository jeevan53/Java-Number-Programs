package com.jeevan.number;

public class EvilN {
	
	public void Evil_or_not(int n) {
		//binary 15 = 1111 
		//even 0ne's is evil, 
		//odd is not evil
		
		int j =1,binary = 0;
		int r =0,number = n;
		while(number!=0) {
			r = number%2;
			binary = binary + (r*j);
			number =number/2;
		}
		if(binary%2 == 0) {
			System.out.println(n+" is Evil number");
		}
		else
		{
			System.out.println(n+" is not Evil number");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EvilN e = new EvilN();
		e.Evil_or_not(15);
		e.Evil_or_not(16);
		e.Evil_or_not(72);
		}

}
