
public class UnionOfTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,4};
		int[] b= {4,5,6};
		int n=4;
		int m=3;
		doUnion(a,n,b,m);
		
	}
	 public static void doUnion(int a[], int n, int b[], int m) 
	    {
	        int[] arr=new int[m+n];
	        int index=a.length;
	        //Your code here
	        for(int i=0;i<a.length;i++){
	            arr[i]=a[i];
	           
	        }
	        for(int i=0;i<b.length;i++){
	                  arr[index]=b[i];
	                  index++;
	                  
	                
	            }
	        for(int i=0;i<arr.length;i++) {
	        	 System.out.print(arr[i]+" ");
	        }
	       
	        }
	        
}



