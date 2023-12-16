

import java.util.Arrays;
import java.util.Scanner;

public class ObjectApp {

	public static void main(String[] args) {
		 
		Scanner scan=new Scanner(System.in);
		
		Objects o1=new Objects();
		
		
	
		System.out.println("Enter name");
		o1.name=scan.nextLine();
		System.out.println("Enter age");
		o1.age=scan.nextInt();
		System.out.println("Enter Phone number");
		o1.phoneNo=scan.nextInt();
		o1.knowYou();

	}

}
