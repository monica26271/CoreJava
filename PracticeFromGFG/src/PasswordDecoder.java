
public class PasswordDecoder {

    public static void main(String[] args) {
       String str="23796115110113721110141108";
       StringBuffer sb=new StringBuffer();
    
       for(int i=str.length()-1;i>=0;i--) {
    	   sb.append(str.charAt(i));
       }
      
       str=sb.toString();
       System.out.println(str);
       
       StringBuilder pass = new StringBuilder();
       int i = 0;
       while(i<str.length()) {
    	   int two = Integer.parseInt((String) str.subSequence(i, i+2));
    	   if((two>=65&&two<=90) || (two>=97 && two<=99) || two == 32) {
    		   pass.append((char)(two));
    		   i +=2 ;
    	   }else {
    		   int three = Integer.parseInt((String) str.subSequence(i, i+3));
    		   if(three >=100 && three<=122) {
    			   pass.append((char)(three));
        		   i +=3 ;
    		   }
    	   }
       }
       System.out.println(pass.toString());
       
       
       
       
       
       
//       System.out.println(str);
//       int
//       
//      
//       int value=str.charAt(0);
//       System.out.println(value);
//       StringBuffer s1=new StringBuffer();
//       for(int i=1;i<str.length();i++) {
//    	  
//    	   if((value>=65&&value<=90||value>=97&&value<=122)||value==32) {
//    		   s1.append((char)(value));
//    		   value=0;
//    	   }else {
//    		   value=value*10+str.charAt(i);
//    	   }
//    		  
//       }
//       //System.out.println(s1);
    }
}

