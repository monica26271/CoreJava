
public class PalindromeArray {

	public static void main(String[] args) {

		int[] arr= {111,222,333,444,555,777};
		int digit,sum=0;
		int isPalindrome=0;
		for(int i=0;i<arr.length;i++) {
			int n=arr[i];
			//System.out.println(n);
			while(n>0) {
				digit=n%10;
				//System.out.println(digit);
				sum=sum*10+digit;
//				System.out.print(sum+" ");
				n=n/10;
			}
			if(arr[i]==sum) {
				isPalindrome=1;
				sum=0;
				
			}else {
				
				isPalindrome=0;
				break;
			}
			
//			
			
		}
		if(isPalindrome==1) {
			System.out.println("All the elements in the array is palindrome");
			
		}else {
			System.out.println("The elements in the array is not palindrome");
		}
		
		
	}

}
