package AnagramString;

import java.util.Scanner;

public class AnagramStringsDemo {

	public static void main(String[] args) {
		//taking input from the user
		System.out.println("Enter the string 1:");
		Scanner scan=new Scanner(System.in);
		String inputString1=scan.nextLine();
		System.out.println("Enter the string 1:");
		String inputString2=scan.nextLine();
		
		//function call 
		AnagramStrings anagramStrings=new AnagramStrings();
		boolean isAnagram=anagramStrings.anagram(inputString1,inputString2);
		//checking the condition whether is Anagram or not
		if(isAnagram) {
			System.out.println("It is Anagram");
		}
		else {
			System.out.println("It is not Anagaram");
		}
		
		
		//scan close
		scan.close();
	}
}
