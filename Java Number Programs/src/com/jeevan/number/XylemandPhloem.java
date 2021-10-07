package com.jeevan.number;
//12348 1+8 == 2+3+4 , 9 == 9 Xylem
//173156 1+6 = 7+3+1+5, 7 != 16 Pholem
public class XylemandPhloem {
	public void XylemPhloem(int num) {
		int n= num;
		int extreme = 0;
		int mean = 0;
		while(n!=0) {
			
			if(n==num||n<10) {
				extreme = extreme + n%10;
			}
			else {
				mean = mean + n%10;
			}
			n=n/10;
		}
		if(mean == extreme) {
			System.out.println(num+" is Xylem Number");
		}
		else {
			System.out.println(num+" is Phloem Number");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		XylemandPhloem xp = new XylemandPhloem();
		xp.XylemPhloem(12348);
		xp.XylemPhloem(173156);
		xp.XylemPhloem(12225);
	}

}
