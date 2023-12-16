package com.practice.arrays;

import java.util.Scanner;

public class InsertingElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int[] arr=new int[20];
		
		arr[0]=1;
		arr[2]=3;
		arr[1]=2;
		int n=3;
		for(int i=n;i<arr.length;i++) {
			arr[n]=i+1;
			n++;
			
		}
		for(int i:arr) {
			System.out.print(i+" ");
		}
		int element=4,j=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==element) {
				j=i;
			}
		}
		if(j>=0) {
			for(int i=j;i<arr.length-1;i++) {
				arr[i]=arr[i+1];
			}
		}
		System.out.println("After deleting");
		for(int i:arr) {
			System.out.print(i+" ");
		}

	}

}
