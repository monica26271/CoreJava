
public class isDigitSumIsPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N=5656;
		int digit,sum=0,sum1=0;
        while(N>0){
            
            digit=N%10;
            sum=sum+digit;
            N/=10;   
        }
        
        int temp=sum;
        sum1=sum;
       if(sum>9) {
    	   sum1=0;
    	   while(sum>0) {
           	digit=sum%10;
           	sum1=sum*10+digit;
           	sum/=10;
           }
       }

       
        if(temp==sum1) {
        	System.out.println("Palindrome");
        }
        else {
        	System.out.println("Not Palindrome");
        }

	}

}
