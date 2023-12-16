package com.kn.arraytasks;

import java.util.Scanner;

public class ArrayTraversal {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		
		//Array Declaration and creation
		int[] arr=new int[scan.nextInt()];
		
		//Array initialization
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the "+(i+1)+" array elements : ");
			arr[i]=scan.nextInt();
		}
		
//		//Creation an object for the behavior
//		ForwardArrayTraversing forwardArrayTraversing=new ForwardArrayTraversing();
//		//calling the  forward traversing behavior 
//		forwardArrayTraversing.ArrayElemntsForwardTraversal(arr);
		
		
		//Creation an object for the behavior
		BackwardArrayTraversal backwardArrayTraversal=new BackwardArrayTraversal();
		//calling the  forward traversing behavior 
		backwardArrayTraversal.arrayElementsBackwardTraversal(arr);
		//scan close
		scan.close();
		
	}
}
