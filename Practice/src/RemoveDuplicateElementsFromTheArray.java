import java.util.Arrays;

public class RemoveDuplicateElementsFromTheArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {1,3,2,4,3,2,4,5,4};
		Arrays.sort(arr);
		int[] brr=new int[arr.length];
		int j=0;
		for(int i=0;i<arr.length-1;i++) {
			
				if(arr[i]!=arr[i+1]) {
					brr[j]=arr[i+1];
					j++;
				
				
			}
			
		}
		for(int i:arr) {
			System.out.print(i+" ");
		}

	}

}
