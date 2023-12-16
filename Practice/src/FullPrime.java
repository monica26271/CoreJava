
public class FullPrime {

	public static void main(String[] args) {
		  
		int count=0,count1=0,N=31,z=N,digit,sum=0;
		    for(int i=2;i<N;i++){
		        if(N%i==0){
		            count++;
		        }
		        while(z>0){
		        	digit=z%10;
		        	if(digit%i==0) {
		        		count1++;
		        	}
		        	z/=10;
		        }
		    }
		    if(count==0) {
		    	if(count1==0) {
		    		System.out.println("Prime");
		    	}
		    }
		    
		    

	}

}
