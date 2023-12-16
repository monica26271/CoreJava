
public class uniqueElementLength {

	public static void main(String[] args) {
		String s="pwwkew";
		
		char[] arr=s.toCharArray();
		StringBuffer sb=new StringBuffer();
		int k=0;
		
		
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					k++;
				}
				
			}
			if(k==1) {
				sb.append(arr[i]);
			
			}
			k=0;
		}
		System.out.println(sb.length());
		System.out.println(sb);
}
		



	

}