// WAP to check the number is even or odd

import java.util.Scanner;
public class EvenOddDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		
		
		if(a%2==0) {
			System.out.println("even number");
		}
		else {
			System.out.println("odd number");
		}
		scan.close();
	}
}
