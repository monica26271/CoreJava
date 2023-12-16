import java.util.Scanner;

public class FactorialDemo {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("enter value to find factorials");
		int n=scan.nextInt();
		int res=facto(n);
		System.out.println("the factorial of "+n+" = "+res);
		scan.close();
	}
	static int facto(int n) {
		for(int i=(n-1);i>0;i--) {
			n=n*i;
		}
		return n;
		
	}

}
