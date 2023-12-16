import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=scan.nextInt();
		series(n);
		
		scan.close();

	}

	private static void series(int n) {
		int firstNumber=0,secondNumber=1,sum=0;
		System.out.println(firstNumber+" "+secondNumber);
		for(int i=1;i<=n;i++) {
			sum=firstNumber+secondNumber;
			firstNumber=secondNumber;
			secondNumber=sum;
			System.out.println(sum);
			
			
		}
		
	}

}
