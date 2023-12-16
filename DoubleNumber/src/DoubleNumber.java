// WAP to Double the number 
import java.util.Scanner;

public class DoubleNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to be doubled ");
		int a=scan.nextInt();
		int doublenum=doubleTheNumber(a);
		System.out.println("the double of "+a+" is = "+doublenum);
		
		scan.close();
	}
	public  static int doubleTheNumber(int a) {
		return a*2;
	}

}
