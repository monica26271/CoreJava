package com.kn.arrays;

import java.util.Scanner;

public class Array3DPattern {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		//Array Declaration
		int[][][] arr;
		
		//Array Creation
		arr=new int[4][][];
		
		arr[0]=new int[3][];
		arr[0][0]=new int[2];
		arr[0][1]=new int[4];
		arr[0][2]=new int[1];
		
		arr[1]=new int[2][3];
		
		arr[2]=new int[2][];
		arr[2][0]=new int[2];
		arr[2][1]=new int[1];
		
		arr[3]=new int[3][2];
		
		//Array Initialization
		System.out.println("Enter the elements");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				for(int k=0;k<arr[i][j].length;k++) {
					arr[i][j][k]=scan.nextInt();
				}
			}
		}
		
		//Array Traversing
		System.out.println("==============> Array elements are: <===============");
		for(int i=0;i<arr.length;i++) {
			System.out.println("-----");
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("****");
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println(arr[i][j][k]);
				}
			}
		}
		scan.close();
	}

}

/*Output
  Enter the elements
10
20
30
40
50
60
70
80
90
100
11
12
13
14
15
16
17
18
19
20
21
22
==============> Array elements are: <===============
-----
****
10
20
****
30
40
50
60
****
70
-----
****
80
90
100
****
1112
13
-----
****
14
15
****
16
-----
****
17
18
****
19
20
****
21
22
*/