//WAP to create a set of methods that will do subtraction,multiplication,division,and find the reminder

import java.util.Scanner;

public class ArithmeticOperation {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter two numbers for subtraction ");
		int sub=subtractNumbers(scan.nextInt(),scan.nextInt());
		System.out.println("difference of two numbers ="+sub);
		System.out.println("Enter two numbers for multiplication ");
		int mul=multiplyNumbers(scan.nextInt(),scan.nextInt());
		System.out.println("Multiplication of two numbers ="+mul);
		System.out.println("Enter two numbers for division ");
		double div=divideNumbers(scan.nextDouble(),scan.nextDouble());
		System.out.println("Division of two numbers ="+div);
		System.out.println("Enter two numbers to find reminder ");
		int reminder=findReminder(scan.nextInt(),scan.nextInt());
		System.out.println("Reminder is  ="+reminder);
		
		scan.close();
	}
	public static int  subtractNumbers(int num1,int num2) {
		int sm=num1-num2;
		return sm;
	}
	public static int multiplyNumbers(int num1,int num2) {
		int mul= num1*num2;
		return mul;
	}
	public static double divideNumbers(double num1,double num2) {
		double qu= num1/num2;
		return qu;
	}
	public static int findReminder(int num1,int num2) {
		 int rem= num1%num2;
		return rem;
	}

}
