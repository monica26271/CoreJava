import java.util.Scanner;
public class AddDemo {
	public static void main(String[] args) {
//------------------------------------ without parameter and return type-----------------------------------------------------------------
		
	/*	add();
	}
	static void add(){
		System.out.println("enter two numbers");
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int sum=a+b;
		System.out.println(sum);	
	}*/
    //---------------------------- with parameters without retun type----------------------------------------------------------------
		
		/*Scanner scan=new Scanner(System.in);
		System.out.println("enter two numbers");
		int a=scan.nextInt();
		int b=scan.nextInt();
		add(a, b);
		

}
	static void add(int x,int y) {
		int sum=x+y;
		System.out.println(+sum);
		
	}*/
		
	//----------------------------------without parameters and with return type-------------------------------------------
		
//		int result=add();
//		System.out.println(result);
//	}
//		static int  add() {
//			System.out.println("enter two numbers");
//			Scanner scan=new Scanner(System.in);
//			int a=scan.nextInt();
//			int b=scan.nextInt();
//			int sum=a+b;
//			return sum;
		
		
	//---------------------------------------- with parameters and return type--------------------------------------------------
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter two numbers");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int result=add(a,b);
		System.out.println("sum = "+result);
			}
	static int add(int y,int x) {
		int sum=x+y;
		return sum;
	}
	}

