package com.jeevan.number;

import java.util.ArrayList;
//10000 decreasing or equal order only = bounce number
//0234566 increasing or equal order only = bounce number
// 2014351 has both increasing or decreasing order = not bounce number
public class BounceN {
	public void Bounce_or_not(int x) {
		int n =x;
		ArrayList<Integer> terms= new ArrayList<Integer>();
		while(n!=0) {
			terms.add(n%10);
			n = n/10;
		}
		//System.out.println(terms);
		int inc = 0, dec = 0;
		for(int i = 0;i<terms.size()-1;i++) {
			if(terms.get(i)<terms.get(i+1)) {
				inc++;
			}
			else if(terms.get(i)>terms.get(i+1)) {
				dec++;
			}
			//else {
			//	equal++;
		//	}
		}
		if(inc==0||dec==0) {
			System.out.println(x+" is Bounce Number");
		}
		else {
			System.out.println(x+" is not a Bounce Number");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BounceN b = new BounceN();
		b.Bounce_or_not(10000);
		b.Bounce_or_not(100001);
		b.Bounce_or_not(2014351);
		b.Bounce_or_not(12345678);
		b.Bounce_or_not(875421);
	}

}
