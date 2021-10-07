package com.jeevan.number;

public class PostiveorNegativeN {

	public void pos_or_neg(int num) {
		if(num>0) {
			System.out.println(num+" is Postive Number");
		}
		else if(num<0) {
			System.out.println(num+" is Negative Number");
		}
		else {
			System.out.println("Number entered is Zero");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PostiveorNegativeN pn = new PostiveorNegativeN();
		pn.pos_or_neg(34);
		pn.pos_or_neg(-149);
		pn.pos_or_neg(0);
	}

}
