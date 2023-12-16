package com.kn.arraytasks;

import java.util.Scanner;

public class FindingElementInAnArrayUsingBinarySearch {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		//array creation and initialization
		int[] arr= {10,20,30,40,50,60,70,80,90,100,120,130,140,150};
		
		System.out.println("Enter the element to be found");
		int element=scan.nextInt();
		
		//calling method
		findingElement(arr,element);
		
		//scan close
		scan.close();
	}
	
	
	//Method to find the element is present in array or not
	public static void findingElement(int[] arr, int element) {
		int low=0, high=arr.length-1,position=-1,mid=0;
		boolean isElementFound=false;
		
		while(low<=high) {
			mid=(low+high)/2;
			if(element==arr[mid]) {
				isElementFound=true;
				position=mid+1;
				break;
			}
			else if(element>arr[mid]){
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}
		if(isElementFound) {
			System.out.println("Element "+element+" is Found at the position "+position);
		}else {
			System.out.println("Element "+element+" is not Found");
		}
	}
}
