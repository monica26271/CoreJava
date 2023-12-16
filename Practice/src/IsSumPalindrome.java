
public class IsSumPalindrome {

	public static void main(String[] args) {

		long n=73;
		long m=n+palindrome(n);
	
		System.out.println(m);
		for(int i=1;i<6;i++) {
			if(m==palindrome(m)) {
				System.out.println("Palindrome");
				System.out.println(m);
				
			}else {
				m=m+i;
				palindrome(m);
			}
		}
		
		
		
	}

	private static long palindrome(long n) {
		long sum=0,digit;
		while(n>0) {
			digit=n%10;
			sum=sum*10+digit;
			n/=10;
		}
		return sum;
	}

}
