//WAP to accept the 8 sem marks and return the average

import java.util.Scanner;

public class SemAverageCalculator {

	public static void main(String[] args) {
		
		double average=average();
		System.out.println("Average of all 8 sem="+average);
		
		
		}

	static double average(){
		Scanner scan =new Scanner(System.in);
//		for(int i=0;i<=8;++i) {
//			System.out.println("Enter the"+i+" sem marks");
//			double sem=scan.nextDouble();
//			return sem++;
//			
//		}
		System.out.println("Enter the 1st sem marks");
		double sem1=scan.nextDouble();
		System.out.println("Enter the 2nd sem marks");
		double sem2=scan.nextDouble();
		System.out.println("Enter the 3rd sem marks");
		double sem3=scan.nextDouble();
		System.out.println("Enter the 4th sem marks");
		double sem4=scan.nextDouble();
		System.out.println("Enter the 5th sem marks");
		double sem5=scan.nextDouble();
		System.out.println("Enter the 6th sem marks");
		double sem6=scan.nextDouble();
		System.out.println("Enter the 7th sem marks");
		double sem7=scan.nextDouble();
		System.out.println("Enter the 8th sem marks");
		double sem8=scan.nextDouble();
		return (sem1+sem2+sem3+sem4+sem5+sem6+sem7+sem8)/8;
		
	
	}

}
