package com.kn.casechange;

public class CharacterCaseChanging {

	public String characterCase(String s1) {
		
		char[] brr=s1.toCharArray();
		for(int i=0;i<brr.length;i++) {
			if(brr[i]>=65&&brr[i]<=90) {
				brr[i]=(char)(brr[i]+32);
			}
			else if(brr[i]>=97&&brr[i]<=122) {
				brr[i]=(char)(brr[i]-32);
			}
			
		}
		
		StringBuffer crr=new StringBuffer();
		
		for(char i: brr) {
			crr.append(i);
		}
		return crr.toString();
	
	
	}
	

}
