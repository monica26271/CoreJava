import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int num=scan.nextInt();
		boolean n=isprime(num);
		if(n==true) {
			System.out.println("is prime");
		}
		else {
			System.out.println("is not prime");
		}
		
		scan.close();
	}

	 static boolean isprime(int num) {
		  boolean prime=true;
		 for(int i=2;i<num;i++) {
			 if(num%i==0) {
				 prime=false;
				 break;
			 }
		 }
		return prime;
	}

}
