import java.util.Scanner;

public class Vibgyor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your option:");
		char a=sc.next().charAt(0);
		
		switch (a) {
			case 'v':
				System.out.println("Its a rainbow color");
				break;
			case 'i':
				System.out.println("Its a rainbow color");
				break;
			case 'b':
				System.out.println("Its a rainbow color");
				break;
			case 'g':
				System.out.println("Its a rainbow color");
				break;
			case 'y':
				System.out.println("Its a rainbow color");
				break;
			case 'o':
				System.out.println("Its a rainbow color");
				break;
			case 'r':
				System.out.println("Its a rainbow color");
				break;
			default:
				System.out.println("Its not a rainbow color");
		}
		System.out.println("-----end-----");
		
		sc.close();

	}

}
