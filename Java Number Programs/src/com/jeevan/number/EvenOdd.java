package com.jeevan.number;

public class EvenOdd {
	public void even(int n) {
		for(int i=1;i<=n;i++) {
		if(i%2==0) {
			System.out.printf(i+" ");
		}
	}
	}
	public void odd(int n) {
		for(int i=1;i<=n;i++) {
		if(i%2==1) {
			System.out.printf(i+" ");
		}
		}
	}
	public void sum(int n) {
		int sum = 0;
		for(int i =1;i<=n;i++) {
			sum = sum+i;
		}
		System.out.printf(""+sum);
	}
	public void evenorodd(int num) {
		System.out.println("Even numbers are: ");
		even(num);
		System.out.println("");
		System.out.println("Odd numbers are: ");
		odd(num);
		System.out.println("");
		System.out.println("Sum of first "+num+" numbers are: ");
		sum(num);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EvenOdd eo = new EvenOdd();
		eo.evenorodd(10);
	}

}
