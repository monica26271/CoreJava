import java.util.Scanner;

public class JourneyCalculatorApp {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		
		JourneyCalculator b1=new JourneyCalculator();
		System.out.println("Enter the speed =");
		b1.speed=scan.nextDouble();
		System.out.println("Enter the time taken = ");
		b1.time=scan.nextDouble();
		double res= b1.calculateDistance(b1.speed, b1.time);
		System.out.println(" The distance covered is ="+res);
		

	}

}
