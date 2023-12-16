package com.kn.mutablestrings;

public class StringBufferDemo {

	public static void main(String[] args) {
StringBuffer stringBuffer=new StringBuffer("Ram");
		
		System.out.println("Data= "+stringBuffer);
		System.out.println("Length= "+stringBuffer.length());
		System.out.println("Capacity= "+stringBuffer.capacity());
		
		System.out.println("*****************");
		System.out.println();
		
		
		stringBuffer.append("Sita");
		stringBuffer.append("Sita");
		stringBuffer.append("Sita");
		stringBuffer.append("Sita");
		stringBuffer.append(" ");
		System.out.println("Data= "+stringBuffer);
		System.out.println("Length= "+stringBuffer.length());
		System.out.println("Capacity= "+stringBuffer.capacity());
		

	}

}
