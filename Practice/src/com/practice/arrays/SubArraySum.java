package com.practice.arrays;

public class SubArraySum {

	public static void main(String[] args) {

		int[] arr= {1,2,3,7,5};
		int element=12;
		int m1=0,i=0,j=0,l=0,index=0;
		while(m1<=element){
			if(m1>element) {
				j=m1-element;
				if(j!=0) {
					for(int k=0;k<arr.length;k++) {
						l+=arr[k];	
						if(j==l) {
							
							index=k+1;
							
							break;
						}
					}
				}
			}else if(m1==element) {
				break;
			}else {
				m1=m1+arr[i];
				i++;
			}
		}
		System.out.println((index+1)+" "+i);
	}

}
