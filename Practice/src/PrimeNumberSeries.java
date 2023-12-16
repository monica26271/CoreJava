import java.util.Scanner;

public class PrimeNumberSeries {

	public static void main(String[] args) {
		System.out.println("Enter the how many prime numbers to be printed: ");
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		
		int j=2,count=0;
		for(int k=0;k<=num;k++) {
			for(int i=2;i<=j;i++) {
				if(j%i==0) {
					count++;
				}
			}
			if(count==1) {
				System.out.print(j+" ");
				
				
			}else {
				if(k!=num) {
					k=k-1;
				}
			}
			j++;
			count=0;
		}
		scan.close();
		
		

	}

}
