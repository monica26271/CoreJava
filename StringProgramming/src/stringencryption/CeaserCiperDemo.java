package stringencryption;

import java.util.Scanner;

public class CeaserCiperDemo {

	public static void main(String[] args) {
		//Input 
		System.out.println("Enter the String :");
		Scanner scan=new Scanner(System.in);
		String inputText=scan.next();
		System.out.println("Enter the key-Value:");
		int n=scan.nextInt();
		
		//creation of object
		CeaserCiper ceaserCiper=new CeaserCiper();
		
		System.out.println("The Encrypted Text Message is: "+ceaserCiper.encryptionUsingCeaserCiper(inputText,n));
		
		//Releasing the resource
		scan.close();
		
		

	}

}
