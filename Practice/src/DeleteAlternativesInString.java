
public class DeleteAlternativesInString {

	public static void main(String[] args) {
		String s="Geeks";
		
		StringBuffer b=new StringBuffer();
		String g="";
		
		for(int i=0;i<s.length();i++) {
			if(i%2==0) {
				b.append(s.charAt(i));
				g=g+s.charAt(i);
			}
		}
		System.out.println(b.toString());
		System.out.println(g);
	}

}
