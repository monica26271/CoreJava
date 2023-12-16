package com.kn.romannumbers;

public class RomanNumbers {

	public String findingRomanNumbers(int number) {
		StringBuffer sb=new StringBuffer();
		int num=number;
		int[] numbers= {	1000	,	900		,	500	,	400	,	100	,	90	,	50	,	40	,	10	,9,		5	,	4	,1};
		String[] values= {	"M"		,	"CM"	,	"D"	,	"CD",	"C"	,	"XC",	"L"	,	"XL",	"X"	,"IX",	"V"	,"IV"	,"I"};			
		int i=0;
		while(num>0) {
				
				if(num>=numbers[i]) {
					num=num-numbers[i];
					sb.append(values[i]);
					i=0;
			}
				else {
					i++;
				}
		}
		
		
		return sb.toString();
	}

}
