
public class Median {

	public static void main(String[] args) {
		
		int[] v= {56,67,30,79};
		
		 for(int i=0;i<v.length;i++){
	            int count=0;
	            for(int j=0;j<v.length-1-i;j++){
	                if(v[j]>v[j+1]){
	                    int temp=v[j];
	                    v[j]=v[j+1];
	                    v[j+1]=temp;
	                    count=1;
	                }
	            }
	            if(count==0){
	                break;
	            }
	           
	        }
	        int median=0,index=v.length/2;
	        System.out.println();
	        if(v.length%2!=0){
	            median=v[index];
	        }else{
	          median=(v[index-1]+v[index])/2; 
	        }
	        System.out.println(median);
	}
}
