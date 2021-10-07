package com.jeevan.number;

public class ISBN {
/*
 *Number2: 1259060977

Sum = (1*10) + (2*9) + (5*8) + (9*7) + (0*6) + (6*5) + (0*4) + (9*3) + (7*2) + (7*1)
209 % 11 = 0 so legal number
suppose sum is 281 %11 !=0 not legal number
 */
	
	public void ISBN_or_not(long n)
	{
		long r = 0;
		long x= n,sum =0;
		for(long i =1;i<=10;i++) {
			r = x%10;
			sum = sum + (i*r);
			x = x/10;
		}
		System.out.println(sum);
		if(sum%11==0) {
			System.out.println(n+" is Legal Number");
		}
		else
		{
			System.out.println(n+" is not Legal Number");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ISBN i = new ISBN();
		i.ISBN_or_not(1259060977);
		i.ISBN_or_not(1147852369);
	}

}
