
public class ParenthesisChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="[{()}]";
		
		
		if(isPar(str)) {
			System.out.println("Perfect Number of braceses");
		}else {
			System.out.println("Not Perfect Number of braceses");
		}

	}

	private static boolean isPar(String str) {
		
		char[] arr=str.toCharArray();
		boolean isPar=false;
		
		if(arr.length%2==0) {
			System.out.println(arr.length/2);
			int i=0;
			while(i<=(arr.length/2)){
				System.out.println(arr[i]+" "+arr[arr.length-1-i]);
				if(arr[i]==arr[arr.length-1-i]) {
					isPar=true;
					i++;
				}
				else{
					isPar=false;
					break;
				}
			}
		}
		
	
		
		return isPar;
	}

}
