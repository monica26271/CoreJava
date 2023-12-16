
public class LinearSearch {

	public static void main(String[] args) {
		int[] arr= {10,68,89,45,78};
		int key=35;
		boolean isFound=false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				isFound=true;
				break;
			}
		}
		if(isFound) {
			System.out.println("Found "+key);
		}else {
			System.out.println("Not Found "+key);
		}
	}
}
