package FactorialUsingRecurssion;

import java.util.Scanner;

public class FactorialDemo {

	public static void main(String[] args) {
		//Taking input from the user
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number to find its factorial: ");
		int input=scan.nextInt();
		
		//object creation
		Factorial factorial=new Factorial();
		
		// calling findFactorial method using objects 
		int result=factorial.findFactorial(input);
		
		//printing the result
		System.out.println("The factorial of "+input+" = "+result);
		
		//Releasing the resource
		scan.close();

	}

}
