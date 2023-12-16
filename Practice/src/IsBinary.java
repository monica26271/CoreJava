
public class IsBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="001121111000";
		char[] arr=str.toCharArray();
		 int isbinary=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]=='1'||arr[i]=='0') {
				isbinary=1;
			}else {
				isbinary=0;
				break;
			}
		}
		if(isbinary==1) {
			System.out.println("It is a binary number");
		}else {
			System.out.println("It is not a binary number");
		}

	}

}
