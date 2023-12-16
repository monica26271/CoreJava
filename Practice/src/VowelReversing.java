
public class VowelReversing {

	public static void main(String[] args) {
		
		
		String s="GeeksForGeeks";
		
		char[] arr=s.toCharArray();
		int count=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u') {
				count++;
			}
		}
		char[] vowels=new char[count];
		
		for(int i=0;i<arr.length;i++) {
			int k=0;
			if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u') {
				vowels[k]=arr[i];
				k++;
			}
		}
		 
		

}}