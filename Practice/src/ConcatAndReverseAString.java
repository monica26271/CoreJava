
public class ConcatAndReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Practice";
		String s1="Geeks";
		
		s1=s+s1;
		StringBuffer b=new StringBuffer();
		System.out.println(s1);
		for(int i=s1.length()-1;i>=0;i--) {
			b.append(s1.charAt(i));
		}
		System.out.println(b);
		

	}

}
