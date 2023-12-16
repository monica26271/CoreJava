
public class UppercaseConversion {

	public static void main(String[] args) {
		String s="i love programing";
		System.out.println(transform(s));

	}
	 public static String transform(String s)
	    {
	        // code here
	        char[] arr=s.toCharArray();
	        
	        StringBuffer b=new StringBuffer(arr.length);
	        for(int i=1;i<arr.length;i++){
	            if(arr[i-1]==32||i==0){
	                arr[i]=(char)(arr[i]-32);
	            }
	            
	            
	        }
	        return b.toString();
	    }

}
