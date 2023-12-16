//import java.util.Scanner;

public class IBM {

	public static void main(String[] args) {
////
//////		passwaordDecoding();
//////		 
//////		printFirstCharactersInReversedOrder();
////		
////		printNPrimeNumbers();
////		
////		
////		
////		
////		
////		 
////		 
////	}
////
////	private static void printNPrimeNumbers() {
////		int count=0,j=2,n=10;
////		for(int i=2;i<=j;i++) {
////			if(j%i==0) {
////				count++;
////			}
////		}
////		
////	}
////
////	private static void passwaordDecoding() {
////		String str="23796115110113721110141108";
////		 String reversedStr="";
////		 
////		 for(int i=str.length()-1;i>=0;i--) {
////			 reversedStr=reversedStr+str.charAt(i);
////		 }
////		 System.out.println(reversedStr);
////		 
////		 int i=0;
////		 StringBuilder sb=new StringBuilder();
////		 while(i<reversedStr.length()) {
////			 int value=Integer.parseInt((String) reversedStr.subSequence(i, i+2));
////			 if(((value>=65&&value<=90)||(value>=97&&value<=99)||value==32)) {
////				 sb.append((char)value);
////				 i=i+2;
////			 }else {
////				 value=Integer.parseInt((String) reversedStr.subSequence(i, i+3));
////				 if(value>=100&&value<=122) {
////					 sb.append((char)value);
////					 i=i+3;
////				 }
////			 }
////		 }
////		 System.out.println(sb.toString());		
////	}
////
////	private static void printFirstCharactersInReversedOrder() {
////		String s="Monica Nandish Vijaya";
////		String[] sa=s.split(" ");
////		
////		for(int i=sa.length-1;i>=0;i--) {
////			System.out.print(sa[i].charAt(0));
////		}		
//		
//		
//		
//		
//		
////====================================================================================================================================================================================
//		
////		int a=12;
////		int b=36;
////		int c=48;
////		int g=(a*b)/gcd(a,b);
////		int g1=(g*c)/gcd(g,c);
////		System.out.println(g1);
////		
////	}
////
////	private static int gcd(int a, int b) {
////		int gcd=0;
////		for(int i=1;i<=a&&i<=b;i++) {
////			if(a%i==0&&b%i==0) {
////				gcd=i;
////			}
////		}
////		return gcd;
////=====================================================================================================================================
//		Scanner scan=new Scanner(System.in);System.out.println("row");
//		int row=scan.nextInt();
//		System.out.println("column");
//		int col=scan.nextInt();
////		
//		
//		
////		for(int i=1;i<=n;i++) {
////			for(int j=1;j<=n;j++) {
////				if(i==1||i==n||j<=1||j>=n) {
////					System.out.print("*");
////				}else {
////					System.out.print(" ");
////				}
////				
////			}
////			System.out.println();
////		}
////		5
////		*****
////		*   *
////		*   *
////		*   *
////		*****
//		
//		
//		
//		
//	//===================================================
//		
////		int c=col-row;
////		for(int i=1;i<=row;i++) {
////			for(int j=1;j<=col;j++) {
////				if(j>=i&&j<=i+c) {
////					System.out.print("*");
////				}
////				else {
////					System.out.print(" ");
////				}
////			}
////			System.out.println();
////		}
//	/*row
//	4
//	column
//	7
//	 ****   
//	  ****  
//	   **** 
//	    ****	*/
//	//===============================================================
//		
////		for(int i=1;i<=row;i++) {
////			for(int j=1;j<=col;j++) {
////				if(j<=i||j>=col+1-i) {
////					System.out.print("*");
////				}else {
////					System.out.print(" ");
////				}
////			}
////			System.out.println();
////		}
//	//=======================================
//		
////		int k=4;
////		for(int i=1;i<=row;i++) {
////			if(i>=4) {
////				k++;
////			}else {
////				k--;
////			}
////			for(int j=1;j<=col;j++) {
////				if(j==k||j==row+1-k) {
////					System.out.print("*");
////				}else {
////					System.out.print(" ");
////				}
////			}
////			System.out.println();
////		}
////		
//			for(int i=1;i<=row;i++) {
//				for(int j=1;j<=col;j++) {
//					if(i%2!=0) {
//						if(j%2!=0) {
//							System.out.print("*");
//						}else {
//							System.out.print(" ");
//						}
//					}
//					else if(i%2==0) {
//						if(j%2==0) {
//							System.out.print("*");
//						}else {
//							System.out.print(" ");
//						}
//					}
//					else {
//						System.out.print(" ");
//					}
//				}
//				System.out.println();
//			}
//	
//	
		
		
		
//============================================================================================================================================
		
		
//		int num=145;
//		int num1=num;
//		int sum=0;
//		while(num1>0) {
//			int digit=num1%10;
//			sum=sum+fact(digit);
//			num1=num1/10;
//			
//		}
//		if(num==sum) {
//			System.out.println("Strong number");
//		}else {
//			System.out.println("Not strong number");
//		}
//	}
//
//	private static int fact(int digit) {
//		if(digit==1) {
//			return 1;
//		}
//		return digit*fact(digit-1);
//		
		
		
		
		
		
		
		
		String str="C5200L-24P";
		
		int mod=0,n=0;
		if(str.charAt(0)>=65&&str.charAt(0)<=90) {
			if(str.charAt(1)>=65&&str.charAt(1)<=90) {
				mod=Integer.parseInt(str.substring(2, 6));
				n=Integer.parseInt(str.substring(11,13));
			}else {
				mod=Integer.parseInt(str.substring(1, 5));
				n=Integer.parseInt(str.substring(7,9));
			}
			//System.out.println(mod+" "+n);
			if((mod==5200||mod==5220||mod==5370||mod==3700)&&n<=24) {
				System.out.println("Type 1");
			}else {
				
			}
		}
	}

}
