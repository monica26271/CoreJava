
public class ReverseStringInGfg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="GS1234a";
//		System.out.println(reverseWord(str));
//		String str1="i.like.this.program.very.much";
//		String[] a=str1.split("\\.");
//		
//		StringBuffer b=new StringBuffer();
//		
//		for(int i=a.length-1;i>=0;i--) {
//			
//			b.append(a[i]);
//			if(i!=0) {
//				b.append(".");
//			}
//		}
//		System.out.println(b);
		System.out.println(str.matches("^[A-Z][A-Z]*....[a-z]"));		

	}
	public static String reverseWord(String str)
    {
        // Reverse the string str
        StringBuffer b=new StringBuffer();
        for(int i=str.length()-1;i>=0;i--){	
            b.append(str.charAt(i));
        }
        return b.toString();
        //output:
		//skeeG
    }

}
