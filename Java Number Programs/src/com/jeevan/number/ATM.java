package com.jeevan.number;

import java.util.Scanner;

public class ATM {
	
	public static void main(String[] args) {
		int balance = 10000,deposit,withdrawl;
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("ATM");
			System.out.println("---");
			System.out.println("Choose 1 for Balance Check");
			System.out.println("Choose 2 for Withdrawl");
			System.out.println("Choose 3 for Deposit");
			System.out.println("Choose 4 for Exit");

		
		int choose = s.nextInt();
		switch(choose){
		case 1:
			System.out.println("Balance: "+balance);
			System.out.println("");
			break;
		case 2:
			System.out.println("Enter amount to withdrawl: ");
			withdrawl = s.nextInt();
			if(balance>withdrawl) {
			balance = balance - withdrawl;
			System.out.println("Please collect your money");
			}
			else {
				System.out.println("Insufficient Balance");
			}
			System.out.println("");
			break;
		case 3:
			System.out.println("Enter amount to be Deposit: ");
			deposit = s.nextInt();
			balance = balance+deposit;
			System.out.println("Amount deposited");
			System.out.println("");
			break;
		case 4:
			System.exit(0);
		}
		s.close();
		}
	}

}
