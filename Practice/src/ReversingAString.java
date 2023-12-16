

public class ReversingAString {

	public static void main(String[] args) {

	
		String str="Hi I Am Monica";
		
		char[] str1=str.toCharArray();
		char[] str2=new char[str1.length];

		
		for(int i=0;i<str1.length;i++) {
			if(str1[i]==32) {
				str2[i]=(int)32;
			}
		}
		int j=str1.length-1;
		for(int i=0;i<str1.length;i++) {
			if(str1[i]!=' ') {
				if(str2[j]==32) {
					j--;
				}
				str2[j]=str1[i];
				j--;
			}
			}
		for(char i:str2) {
			System.out.print(i);
		}
	}
}