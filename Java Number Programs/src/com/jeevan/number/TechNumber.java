package com.jeevan.number;

public class TechNumber {
	// 2025 => 20+25 => 45  => 45*45 => 2025
	public void isTechN(int num) {
		//num length should be even
		//length of number (no of digits)
		int digits=0;
		int n = num;
		while(n>0) {
			digits++;
			n= n/10;
		}
		//System.out.println(digits);
		int first =num/(int)Math.pow(10,digits/2);
		int last = num%(int)Math.pow(10,digits/2);
		//System.out.println(first+" "+last);
		int result = first+last;
		//System.out.println(result);
		int squareResult = result*result;
		//System.out.println(squareResult);
		if(squareResult ==num) {
			System.out.println(num+" is Tech Number");
		}
		else {
			System.out.println(num+" is not a Tech Number");
		}
		
	}
	public static void main (String[] args) {
		TechNumber t = new TechNumber();
		t.isTechN(2025);
		t.isTechN(2021);
		
	}

}
