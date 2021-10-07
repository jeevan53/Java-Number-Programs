package com.jeevan.number;

public class Sunny {
	//Sunny = 1 + perfect square
	public void isSunnyN(int n) {
		int num = n+1;// num=n;
		int sqRoot = (int)Math.sqrt(num);
		//System.out.println(sqRoot);
		if((sqRoot*sqRoot)==num) {
			System.out.println(n+" is a Sunny Number");
		}
		else
		{
			System.out.println(n+" is not a Sunny Number");
		}
	}
	public static void main(String[] args) {
		Sunny s = new Sunny();
		s.isSunnyN(20);
		s.isSunnyN(80);
		s.isSunnyN(-1);
		s.isSunnyN(-3);
	}
}
