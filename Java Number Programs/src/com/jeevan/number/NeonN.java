package com.jeevan.number;

public class NeonN {
	//9 ==> 9*9 ==>45 ==> 4+5 ==> 9
	// not neon => 8 ==> 64 ==> 6+4 = 10 !=8
	public void Neon_or_not(int n) {
		int square = n*n;
		int sum = 0;
		while(square>0) {
			sum = sum+(square%10);
			square= square/10;
		}
		if(sum == n)
		{
			System.out.println(n+" is Neon Number");
		}
		else {
			System.out.println(n+" is not a Neon Number");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NeonN s = new NeonN();
		s.Neon_or_not(9);
		s.Neon_or_not(23);
		s.Neon_or_not(45);
		s.Neon_or_not(1);
	}

}
