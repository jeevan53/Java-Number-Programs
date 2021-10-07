package com.jeevan.number;

public class AutomorphicNumber {
	/*
	 A number is called an automorphic number if and only if the square of the given number ends with the same number itself. 
	 For example, 25, 76 are automorphic numbers because their square is 625 and 5776, respectively and 
	 the last two digits of the square represent the number itself. Some other automorphic numbers are 5, 6, 36, 890625, etc.
	 */
	public boolean isAutomorphic(int n) {
		int square = n*n;
		while(n>0) {
			if(n%10 != square%10) {
				return false;
			}
			n = n/10;
			square = square/10;
		}
		return true;
	}
	public static void main (String[] args) {
		AutomorphicNumber an= new AutomorphicNumber();
		System.out.println(an.isAutomorphic(6)?"Automorphic":"Not Automorphic");
		System.out.println(an.isAutomorphic(13)?"Automorphic":"Not Automorphic");
		System.out.println(an.isAutomorphic(25)?"Automorphic":"Not Automorphic");
		System.out.println(an.isAutomorphic(36)?"Automorphic":"Not Automorphic");
		System.out.println(an.isAutomorphic(76)?"Automorphic":"Not Automorphic");
	}
}
