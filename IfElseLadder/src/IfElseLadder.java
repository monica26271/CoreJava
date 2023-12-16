// Write a program to determine given character is vowel or Consonant Using If Else Ladder

import java.util.Scanner;

public class IfElseLadder {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the character");
		char character= scan.next().charAt(0);
		
		if(character=='a'||character=='A') {
			System.out.println("given character "+character+" is a Vowel");
		}
		else if(character=='e'||character=='E') {
			System.out.println("given character "+character+" is a Vowel");
		}
		else if(character=='i'||character=='I') {
			System.out.println("given character "+character+" is a Vowel");
		}		
		else if(character=='o'||character=='O') {
			System.out.println("given character "+character+" is a Vowel");
		}
		else if(character=='u'||character=='U') {
			System.out.println("given character "+character+" is a Vowel");
		}
		else {
			System.out.println("given character "+character+" is Consonant");
		}
		scan.close();
	}

}
