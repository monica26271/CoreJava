package com.practice.arrays;

public class Subset {

	public static void main(String[] args) {

		long[] a1 = {1,2, 3 ,4 ,5 ,6, 7, 8};
		long[] a2= { 1 ,2 ,3 ,1};
		long n=a1.length,m=a2.length;
		String s=isSubset(a1,a2,n,m);
		if(s=="Yes") {
			System.out.println("a2[] is a subset of a1[]");
		}else {
			System.out.println("a2[] is not a subset of a1[]");
		}
		
	}
	 public static String isSubset( long a1[], long a2[], long n, long m) {
	        String isSubSet="No";
	       for(int i=0;i<m;i++){
	    	   isSubSet="No";
	           for(int j=0;j<n;j++){
	               if(a2[i]==a1[j]){
	            	 
	                   isSubSet="Yes";
	               }
	           }
	           if(isSubSet=="No"){
	               break;
	           }
	          
	       }
	       return isSubSet;
	    }
	 
	 
	
	

	
}
