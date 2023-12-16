
public class MissingNumberInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {1,3,4,5,2};
		int j=array[0];
		for(int i=0;i<array.length;i++) {
			if(j>array[i]) {
				j=array[i];
			}
		}
		 int missingNumber=0;
		 for(int i=0;i<=array.length;i++){
        	 if(array[i]!=j){
	                missingNumber=j;
	                break;
	            }else if(array[i]==j){
	                j++;
	            }
        }
	        System.out.println(missingNumber);

	}

}
