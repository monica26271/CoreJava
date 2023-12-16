package com.kn.CharacterCount;

public class NumberOfRepeatingCharacter {

	public static void main(String[] args) {
		
		String s1="AABAACAAD";
		System.out.println(s1);
		char[] arr=s1.toCharArray();

		int count=0;
		StringBuffer brr=new StringBuffer();
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(count==1) {
				brr.append(arr[i]);
			}
			else if(count>1) {
				if(brr.charAt(i)==arr[i]) {
			}
			count=0;
		}
		System.out.println(brr);
		
		
//		 
//		
//		
//		char[] drr=new char[arr.length];
//		for(int i=0;i<crr.length;i++) {
//			//drr[i]=crr[i];
//			//System.out.println(drr[i]);
//		}
//		int index=crr.length;
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<drr.length;j++) {
//				if(arr[i]!=drr[j]) {
//					//drr[j]=arr[];
//				}
//				
//				}
//				
//			}
//		for(int j=0;j<drr.length;j++) {
//			System.out.println(drr[j]);
//		}
//		
//		
//		
//		System.out.println();
//		char[] crr=new char[arr.length];
//	
//		crr[0]=arr[0];
//		int j=0;
//		for(int i=0;i<arr.length;i++) {
//			
//			if(crr[j]==arr[i]) {
//				
//				
//			}
//			else {
//				crr[j]=arr[i];
//				j++;
//			}
//			
//		}
		
	}

}
}

