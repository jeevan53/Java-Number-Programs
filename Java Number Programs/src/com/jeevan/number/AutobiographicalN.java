package com.jeevan.number;

import java.util.ArrayList;
import java.util.Collections;

public class AutobiographicalN {

	public void Ab_or_not(int x) {
		ArrayList<Integer> values = new ArrayList<Integer>();
		int num = x;
		while(num>0) {
			values.add(num%10);
			num=num/10;
		}
		Collections.reverse(values);
		
		boolean flag = true;
	for(int i = 0;i<values.size();i++) {
		int count =0;
		for(int j =0;j<values.size();j++) {
			if(i==values.get(j)) {
				count++;
			}}
			if(count != values.get(i)) {
				flag = false;
				break;
			}
		}
	
		if(flag) {
			System.out.println(x+" is an Autobiographical Number");
		}
		else
		{
			System.out.println(x+" is not a Autobiographical Number");
		
	}}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			AutobiographicalN a = new AutobiographicalN();
			a.Ab_or_not(1210);
			a.Ab_or_not(12300);
			a.Ab_or_not(21200);
	}
	

}
