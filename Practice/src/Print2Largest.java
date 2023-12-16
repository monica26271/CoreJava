
public class Print2Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[] = {12,36, 35, 1, 10, 34, 1};
//		 int temp=0;
//	        for(int i=0;i<arr.length-1;i++){
//	        	   if(arr[i]>arr[i+1]){
//		                temp=arr[i];
//		                System.out.println(temp);
//		            }
//	           
//	        }
//	       // System.out.println(temp);
		
           int N=22074;
		   int i=N,digit;
	        int isTrue=0;
	        while(N>0){
	            digit=N%10;
	           if(digit!=0){
	                if(i%digit==0){
	                isTrue+=1;
	            }
	            
	           }
	            N/=10;
	        }
	        System.out.println(isTrue);
               
           }
           
        
        
    }

	


