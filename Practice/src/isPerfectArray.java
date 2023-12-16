
public class isPerfectArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,2,1};
		boolean isPerfect=false;
		for(int i=0;i<a.length;i++){
            if(a[i]==a[a.length-1-i]){
                isPerfect=true;
            }
            else{
                isPerfect=false;
                break;
            }
        }
		if(isPerfect){
			System.out.println("It is perfect");
		}else {
			System.out.println("It is not perfect");
		}

	}

}
