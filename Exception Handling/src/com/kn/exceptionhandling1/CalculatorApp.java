package com.kn.exceptionhandling1;



import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
 
		System.out.println("Welcome to calculator application");
	    Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the first number = ");
		int a=scan.nextInt();
		System.out.println("Enter the second number = ");
		int b=scan.nextInt();
		
		multiply(a,b);
		System.out.println("**************main() ended***************");
	}

	private static void multiply(int a, int b) {
		System.out.println("Multiply() started ");
		int product=a*b;
		System.out.println("Product = "+product);
		divide(a,b);
		System.out.println("****************multiply() ended*************");
	}

	private static void divide(int a, int b) {
		System.out.println("Divide() started ");
		
		double quotient=0.0;
		try {
			quotient=a/b;
		}catch(ArithmeticException ae) {
			System.out.println("Enter the value of b as non-zero");}
		catch(InputMismatchException ime) {
			System.out.println("type mismatch");
		}
		catch(Exception e) {
			System.out.println("Exception occured");
		}
		finally {
			System.out.println("Quotient = "+quotient);
			
		}
		System.out.println("***********divide() ended*************");
	}

}
