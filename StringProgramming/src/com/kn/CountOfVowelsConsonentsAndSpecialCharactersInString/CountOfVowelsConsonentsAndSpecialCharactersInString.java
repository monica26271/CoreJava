package com.kn.CountOfVowelsConsonentsAndSpecialCharactersInString;

public class CountOfVowelsConsonentsAndSpecialCharactersInString {
//
	public void sortingTheCharacter(String inputString) {
		char[] arr=inputString.toCharArray();
		
		int upperVowels=0,upperConsanents=0,lowerVowels=0,lowerConsanents=0,digits=0,space=0,specialCharacter=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>=65&&arr[i]<=90) {
				if((arr[i]=='A'||arr[i]=='E'||arr[i]=='I'||arr[i]=='O'||arr[i]=='U')) {
					upperVowels++;
				}else {
					upperConsanents++;
				}
			}
			else if(arr[i]>=97&&arr[i]<=122) {
				if((arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u')) {
					lowerVowels++;
				}else {
					lowerConsanents++;
				}
			}
			else if(arr[i]>=48&&arr[i]<=57) {
				digits++;
			}
			else if((int)arr[i]==32) {
				space++;
			}
			else{
				specialCharacter++;
			}
		}
		
		
		System.out.println("UpperCase Vowels="+upperVowels);
		System.out.println("UpperCase Consonants="+upperConsanents);
		System.out.println("LowerCase Vowels="+lowerVowels);
		System.out.println("LowerCase Consonants="+lowerConsanents);
		System.out.println("Digits="+digits);
		System.out.println("Special Character="+specialCharacter);
		System.out.println("Space="+space);
	}
	//I Am Learning @ KodNest123
}
