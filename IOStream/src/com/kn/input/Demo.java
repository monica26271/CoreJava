//Taking input from the StandardInput device keyboard and saving it into the file 

package com.kn.input;

import java.io.FileWriter;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		String path2="c://io//output.txt";
		Scanner scan=new Scanner(System.in);
	try {
		FileWriter fw=new FileWriter(path2);
		System.out.println("enter the number");
		int x;
		while(true) {
			x=scan.nextInt();
			if(x==-1) {
				break;
			}
			 fw.write(String.valueOf(x)+" ");
		}
			
		fw.close();
	}catch(Exception e){
		e.printStackTrace();
	}
	}
		 
}
	
