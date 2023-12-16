
public class DiagonalSum {

	public static void main(String[] args) {
//		int[][] matrix={{1, 1, 1}, 
//				{1, 1, 1}, {1, 1, 1}};
//		int sum=0,n=matrix.length;
//		
//		for(int i=0;i<matrix.length;i++) {
//			for(int j=0;j<matrix[i].length;j++) {
//				if(i==j) {
//					sum=matrix[i][j]+sum+matrix[i][n-i-1];
//				}
//			}
//		}
//		System.out.println(sum);
//	}
	
		String input="hello";
		int size=2;
		char[] arr=input.toCharArray();
	
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<size;j++) {
				System.out.print(arr[i]/+arr[i+1]);
				
			}
		}
		
		
    }
}
