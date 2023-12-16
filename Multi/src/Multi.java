import java.util.Scanner;

public class Multi {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the Input Digit");
		int input=scan.nextInt();
		System.out.println("Enter the Armstrong number ");
		int n=scan.nextInt();
		int sum=1,temp;
		for(int i=1;i<=n;i++) {
			sum*=input;
			
			
		}
		System.out.println(sum);
		temp=sum;
		sum=1;
		System.out.println(sum);

	}

}
