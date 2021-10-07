package com.jeevan.number;

public class MysteryN {
	//154 = 59+95 (i+reverse(i)) = mystery number
	//123 != (i+reverse(i)) not a mystery number
	public int reverse(int n) {
		int rev = 0;
		while(n>0) {
			//r = n%10;
			rev = rev*10 + (n%10);
			n= n/10;
		}
		return rev;
	}
	
	public boolean Myster_or_not(int num) {
		// TODO Auto-generated method stub
		for(int i =1;i<=num/2;i++) {
			int j = reverse(i);
			if(i+j == num) {
				//System.out.println(i+" "+j);
				System.out.println(num+" is a Mystery Number");
				return true;
			}
		}
			System.out.println(num+" is not a Mystery Number");
			return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MysteryN m = new MysteryN();
		m.Myster_or_not(154);
		m.Myster_or_not(44);
		m.Myster_or_not(123);
	}

	

}
