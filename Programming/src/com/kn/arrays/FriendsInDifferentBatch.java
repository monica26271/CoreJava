package com.kn.arrays;

import java.util.Scanner;

public class FriendsInDifferentBatch {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println(" Enter the number of batches");
		int numberOfBatches=scan.nextInt();
		
		
		// array declaration and creation
		String[][] arr=new String[numberOfBatches][];
	
		for(int i=0;i<arr.length;i++) {
				System.out.println("Enter Number of friends in batch "+(i+1));
				arr[i]=new String[scan.nextInt()];
			}
		//array initialization
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("======== Batch "+(i+1)+" ============= ");
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter "+(j+1)+" name of friends");
				arr[i][j]=scan.next();
			}
		}
		//array traversing
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("====== Batch "+(i+1)+" ==========");
			System.out.println("Total number of friend="+arr[i].length);
			for(int j=0;j<arr[i].length;j++) {
				System.out.println(arr[i][j]);
			}
			
		}
		scan.close();
	}

}
