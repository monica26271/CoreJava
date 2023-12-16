package com.kn.arraytasks;

public class BackwardArrayTraversal {
	
	//Backward array traversal behavior
	public void arrayElementsBackwardTraversal(int[] arr) {
		System.out.println("The array elements in array are: ");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}

}
