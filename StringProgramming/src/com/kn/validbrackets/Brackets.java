package com.kn.validbrackets;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Brackets {

//	public void equalNumberOfBrackets(String input) {
//		char[] arr=input.toCharArray();
//		int paranthesis=0,curly=0,square=0;
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]=='(') {
//				paranthesis++;
//			}
//			else if(arr[i]==')') {
//				paranthesis--;
//			}
//			else if(arr[i]=='{') {
//				curly++;
//			}
//			else if(arr[i]=='}') {
//				curly--;
//			}
//			else if(arr[i]=='[') {
//				square++;
//			}
//			else if(arr[i]==']') {
//				square--;
//			}
//		}
//		if(paranthesis==0&&curly==0&&square==0) {
//			System.out.println("The given String is a valid string");
//		}
//		else {
//			System.out.println("The given String is a invalid string");
//		}
//		
//	}
	public static void main(String[] args) 
    { 
  
        // Get the regex to be checked 
        String regex = "(GFG)"; 
  
        // Create a pattern from regex 
        Pattern pattern 
            = Pattern.compile(regex); 
  
        // Get the String to be matched 
        String stringToBeMatched 
            = "GFGGFGFG"; 
  
        // Create a matcher for the input String 
        Matcher matcher 
            = pattern 
                  .matcher(stringToBeMatched); 
  
        // Get the number of capturing groups 
        // using groupCount() method 
        System.out.println(matcher.groupCount()); 
    } 

}
