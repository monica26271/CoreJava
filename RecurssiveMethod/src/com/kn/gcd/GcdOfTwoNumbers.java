package com.kn.gcd;

public class GcdOfTwoNumbers {

	public int findGcd(int num1, int num2) {
		if(num2==0) {
			return num1;
		}else {
			return findGcd(num2,num1%num2);	
		}
		
	}

}
