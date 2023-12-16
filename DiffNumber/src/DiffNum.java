import java.util.Scanner;
public class DiffNum {

	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		System.out.println("enter two numbers");
		int a= scan.nextInt();
		int b=scan.nextInt();
		if(a<b) {
			System.out.println("difference of "+b+"-"+a+" = "+(b-a));
		}
		else {
			int diff=a-b;
			System.out.println("difference of "+a+"-"+b+"="+diff);
		}
		scan.close();
	}

}
