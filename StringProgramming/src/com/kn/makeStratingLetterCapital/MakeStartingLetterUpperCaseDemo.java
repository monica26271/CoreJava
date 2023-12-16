package com.kn.makeStratingLetterCapital;

public class MakeStartingLetterUpperCaseDemo {

	public static void main(String[] args) {
		String s1="I am  learning java";
		
		StringBuffer sb=new StringBuffer(" ");
		String[] arr= s1.split(" ");
		char[] crr;
		for(int i=0;i<arr.length;i++) {
			 crr=arr[i].toString().toCharArray();
			if(crr[0]>=97&&crr[0]<=122) {
				crr[0]=(char)(crr[0]-32);
			}
			
			for(char s:crr) {
				sb.append(s);
			}
			
		}
		
		System.out.println(sb);

	}

}
