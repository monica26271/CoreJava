import java.util.Scanner;

public class MessageDecoderApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//MessageDecoder Decoder=new MessageDecoder();
		System.out.println("Enter the Character");
		//int encode=Decoder.decodeCharacter(scan.next().charAt(0));
		int res=decodeCharacter(scan.next().charAt(0));
		//System.out.println(" The Encoded value is ="+encode);
		System.out.println(" The Encoded value is ="+res);
		
		scan.close();
	}
	 static int decodeCharacter(char ch) {
		
		return  (int) ch;}

}
