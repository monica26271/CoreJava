import java.util.Scanner;

public class MaxNumberInArray {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int[] arr=new int[5];
		int[] arr1=new int[5];
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(" enter number"+(i+1));
			arr[i]=scan.nextInt();		
		}
		
		for(int k=0;k<=arr.length-1;k++) {
			
			
			for(int j=0;j<arr1.length;i++) {
				arr1[k][j]=arr[k][j];
				if(arr[i][j]<=arr1[j][i]) {
					System.out.println(arr[i]);
				}
			}
			
		}

	}
}
