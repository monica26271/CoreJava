package com.kn.fristNonRepeatingCharacter;

public class FirstNonRepeatingCharacter {
	
	//Method that finds the first unique elements present in the String
	public void repeat(String input) {
		
		char[] arr=input.toCharArray();
		
		int counter=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					counter++;
				}
			}
			if(counter==1) {
				System.out.println("The first Unique element found in the string is: "+arr[i]);
				break;
			}
			else if(i==arr.length-1){
				System.out.println("No Unique Element found in string");
				break;
			}
			else {
				counter=0;
			}
		}
}
}
