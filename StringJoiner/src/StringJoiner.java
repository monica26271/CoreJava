//WAP to concatenate two strings

//import java.util.Scanner;

public class StringJoiner {

	public static void main(String[] args) {
//		Scanner scan=new Scanner(System.in);
//		System.out.println("Enter First String");
//		String str1=scan.nextLine();
//		System.out.println("Enter Second String");
//		String str2=scan.nextLine();
		String result=joinString("hello,","world");
		System.out.println("The concation of string is "+result);

//		scan.c.lose();
	}
	
	public static String joinString(String str1,String str2) {
		String res=str1+str2;
		return res;
	}
}
