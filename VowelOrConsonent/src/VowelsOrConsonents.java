// Write a program to determine given character is vowel or Consonant
import java.util.Scanner;

public class VowelsOrConsonents {

	public static void main(String[] args) {
		
		System.out.println("enter the character");
		Scanner scan = new Scanner(System.in);
		char b=scan.next().charAt(0);
		if(b=='a'||b=='e'||b=='i'||b=='o'||b=='u'||b=='A'||b=='E'||b=='I'||b=='O'||b=='U') {
			System.out.println("the given character "+b+" is a vowel");
		}
		else {
			System.out.println("the given character "+b+" is a consonant");
		}
		scan.close();
		

	}

}
