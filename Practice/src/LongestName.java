
public class LongestName {

	public static void main(String[] args) {
		String names[] = { "Geek", "Geeks", "Geeksfor",
				  "GeeksforGeek", "GeeksforGeeks" };
		String s=names[0];
		
		for(int i=1;i<names.length;i++) {
			if(s.length()<names[i].length()) {
				s=names[i];
			}
		}
		
	System.out.println(s);

	}

}
