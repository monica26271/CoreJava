
public class FindingIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {22, 19, 17, 22, 30, 29, 16, 11 ,26, 18, 28, 17, 19 ,20, 28, 22, 13, 18 ,13, 11, 20, 26, 23, 23, 25, 28, 19};
		int key=19;
		boolean isFound=false;
		
		int[] index=new int[2];
        int count=0;
        for(int i=0;i<a.length;i++){
           if(a[i]==key){
               count++;
               if(count==1){
                   index[0]=i;
               }
               index[1]=i;
               isFound=true;
           }
           
        }
        
        
        if(isFound) {
        	System.out.println(index[0]+" "+index[1]);
        }else {
        	index[0]=-1;
       	   	index[1]=-1;
       	   	System.out.println(index[0]+" "+index[1]);
        }
       
        

	}

}
