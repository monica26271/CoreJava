package AnagramString;

public class AnagramStrings {
	
	//Method is used to check it is anagram or not 
	public boolean anagram(String s1, String s2) {
		boolean isAnagram=false;
		
		if(s1.length()==s2.length()) {
			char[] crr1=s1.toCharArray();
			char[] crr2=s2.toCharArray();
			//function call for sorting the array
			crr1=sortCharacterArray(crr1);
			crr2=sortCharacterArray(crr2);
			//checking the elements are same in the array
			for(int i=0;i<crr1.length;i++) {
				if(crr1[i]==crr2[i]) {
					isAnagram=true;
				}
				else {
					isAnagram=false;
					break;
				}
			}
			}
		
		return isAnagram;
	}
	
	//method to sort the Arrays 
	public char[] sortCharacterArray(char[] crr) {
		//insertion sort
		for(int i=1;i<crr.length;i++) {
			char temp=crr[i];
			for(int j=i-1;j>=0;j--) {
				while(temp<crr[j]) {
					crr[j+1]=crr[j];
					crr[j]=temp;
				}
				
			}
			
		}
		return crr;
	}

}
