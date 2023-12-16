
public class GetMoreOrLess {

	public static void main(String[] args) {
		int[] arr= {3,3,3};
		
		int x=3;

		 int count=0,counter=0;
	        for(int i=0;i<arr.length;i++){
	            if(arr[i]<=x){
	                count++;
	            }
	             if(arr[i]>=x){
	                counter++;
	             }
	        }
	        int[] a=new int[2];
	        a[0]=count;
	        a[1]=counter;
	        for(int i:a) {
	        	System.out.print(i+" ");
	        }
	}

}
