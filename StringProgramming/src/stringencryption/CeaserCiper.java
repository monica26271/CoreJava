package stringencryption;

public class CeaserCiper {

	public String encryptionUsingCeaserCiper(String inputText,int n) {
		
		char[] arr=inputText.toCharArray();
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<arr.length;i++) {
			while(n>26) {
				n-=26;
			}
			if((arr[i]>=65&&arr[i]<=90-n)||(arr[i]>=97&&arr[i]<=122-n)) {
				sb.append((char)(arr[i]+n));
			}
			else if((arr[i]>=90-n&&arr[i]<=90)||(arr[i]>=122-n&&arr[i]<=122)) {
				sb.append((char)(arr[i]+n-26));	
			}	
		}
		return sb.toString();
	}

}
