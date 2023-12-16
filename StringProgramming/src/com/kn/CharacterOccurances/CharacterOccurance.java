package com.kn.CharacterOccurances;



public class CharacterOccurance {

	public void characterOccuranceInAString(String inputString) {
		
		char[] arr=inputString.toCharArray();
		
		arr=sortingArray(arr);
		
		
			int counter=1;
		
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]==arr[j+1]) {
					counter++;
				
				}
//				if(j+1==arr.length-1) {
//					if(arr[j+1]==arr[j]) {
//						counter++;
//					}else {
//						System.out.println(arr[j+1]+" = 1 ");
//					}
//				}
				else {
					System.out.println(arr[j]+" = "+counter);
					counter=1;
					
				}
			}
			
		}
		
	

	public char[] sortingArray(char[] arr) {
		for(int i=0;i<arr.length;i++) {
			int counter=0;
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					char temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					counter=1;
				}
				
			}
			if(counter==0) {
				break;
			}
		}
		return arr;
	}

}
