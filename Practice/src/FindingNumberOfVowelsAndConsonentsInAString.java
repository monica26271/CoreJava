
public class FindingNumberOfVowelsAndConsonentsInAString {

	public static void main(String[] args) {
		
		String input="aeioubfgfr kjjhrty";
		
		char[] arr=input.toCharArray();
		int vowels=0,consonents=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u') {
				vowels++;
			}
			else if(arr[i]==' '){
				
			}
			else {
			
				consonents++;
			}
		
		}
		System.out.println("Number of vowels :"+vowels);
		System.out.println("Number of consonents :"+consonents);		
		
		
		
		
		
		
		
		
		

	}

}
