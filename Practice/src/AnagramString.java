
import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		String input1="bad";
		String input2="daa";
		
		char[] arr=input1.toCharArray();
		char[] brr=input2.toCharArray();
		
		Arrays.sort(arr);
		Arrays.sort(brr);
		int count=0;
		
		if(arr.length==brr.length) {
			for(int i=0;i<arr.length;i++) {
				if(arr[i]==brr[i]) {
					count=1;
				}else {
					count=0;
					break;
				}
					
				
			}
			
			if(count==1) {
				System.out.println("Anagram");
			}
			else {
				System.out.println("Not Anagram");
			}
		}
	}

}
