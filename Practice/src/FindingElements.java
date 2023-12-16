
public class FindingElements {

	public static void main(String[] args) {
		long[] a= {2, 8, 7, 1, 5};
		long n=5;
		long[] c=findElements(a,n);
		for(long b:c) {
			System.out.print(b+" ");
		}

	}
	 public static long[] findElements( long a[], long n)
	    {
	        // Your code goes here
	        for(int i=0;i<n;i++){
	            int count=0;
	            for(int j=i+1;j<n-i-1;j++){
	                if(a[j]>a[i]){
	                    long temp=a[i];
	                    a[i]=a[j];
	                    a[j]=temp;
	                    count=1;
	                }
	            }
	            if(count==0){
	                break;
	            }
	        }
	       int c=(int)n-2;
	        long[] b=new long[c];
	        for(int i=0;i<b.length;i++){
	            b[i]=a[i];
	        }
	        return b;
	    }

}
