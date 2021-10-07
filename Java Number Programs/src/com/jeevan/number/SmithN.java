package com.jeevan.number;

import java.util.ArrayList;
import java.util.List;

public class SmithN {
	// 166 1+6+6 =13, 166 = primefactors(2,83) = 2+8+3 = 13, 13=13 smith Number
	// 119 1+1+9 = 11, 119 = primefactors(7,17) = 7+1+7 = 15, 15!=11 not smith number
		static List<Integer> findPrimeFactors(int N)
		{
			int num= N;
		ArrayList<Integer> Primefactors = new ArrayList<Integer>();
			for(int i=2;num%i==0;num = num/i) {
			Primefactors.add(i);
		}
			for(int i =3;i*i<=num;i=i+2) {
				while(num%i==0){
					Primefactors.add(i);
					num =num/i;
				}
			}
			if(num!=1) {
				Primefactors.add(num);
			}
			
		System.out.println(Primefactors);
		int sumofPrimeFactorsdigits = 0;
		for(int i=0;i <Primefactors.size();i++) {
			int x = Primefactors.get(i);
			while(x>0) {
				sumofPrimeFactorsdigits = sumofPrimeFactorsdigits + (x%10);
				x = x/10;
			}
			}
		System.out.println(sumofPrimeFactorsdigits);
		System.out.println(sum(N));
		if(sum(N)==sumofPrimeFactorsdigits) {
			System.out.println(N+" is a Smith Number");
		}
		else {
			System.out.println(N+" is not a Smith Number");
		}
		return Primefactors;
			
	}
		public static int sum(int num) {
			int sum = 0;
			while(num!=0) {
				sum = sum + (num%10);
				num = num/10;
			}
			return sum;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findPrimeFactors(166);
		findPrimeFactors(94);
		findPrimeFactors(119);

	}

}
