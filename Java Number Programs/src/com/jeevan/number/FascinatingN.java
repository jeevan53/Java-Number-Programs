package com.jeevan.number;

public class FascinatingN {
	//n,n2=n*2,n3=n*3 ==> n+n2+n3 == 123456789
	public void fasinating_or_not(int n) {
		int n2 = n*2;
		int n3 = n*3;
		String s =n+""+n2+n3;
		int repeat = 0;
		for(char c= '1';c<='9';c++) {
			int count = 0;
			for(int i =0;i<s.length();i++) {
				char ch = s.charAt(i);
				if(ch==c) {
					count++;
				}}
				if(count>1||count==0) {
					repeat++;
					break;
				}}
		if(repeat==0) 
		{
		System.out.println(n+" is Fascinating Number");
		}
		else
			{
			System.out.println(n+" is not a Fascinating Number");
			}
			}
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FascinatingN f = new FascinatingN();
		f.fasinating_or_not(327);
		f.fasinating_or_not(321);
		f.fasinating_or_not(192);
		f.fasinating_or_not(273);
		f.fasinating_or_not(271);
	}

}
