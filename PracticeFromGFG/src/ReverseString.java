

public class ReverseString {

	public static void main(String[] args) {

		String str="Monica";
		
		StringBuilder b=new StringBuilder();
		for (int i = str.length()-1;i>=0; i--) {
			b.append(str.charAt(i));
		}
		System.out.println(b);
	}

}
