import java.util.Scanner;

public class Quadrant {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		int x=scan.nextInt();
		int y=scan.nextInt();
		int z=scan.nextInt();
		
//		if(x>0&&y>0) {
//			System.out.println("1st");
//		}
//		else if(x<0&&y>0) {
//			System.out.println("2nd");
//		}
//		else if(x<0&&y<0) {
//			System.out.println("3rd");
//		}
//		else {
//			System.out.println("4th");
//		}
		
		
		if((x+y)==z) {
			System.out.println("valid");
		}
		else {
			System.out.println("not valid");
		}
	}

}
