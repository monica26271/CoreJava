package com.kn.mutablestrings;

public class StringBuliderDemo {

	public static void main(String[] args) {
		StringBuilder stringBuilder=new StringBuilder("Ram");
		
		System.out.println("Data= "+stringBuilder);
		System.out.println("Length= "+stringBuilder.length());
		System.out.println("Capacity= "+stringBuilder.capacity());
		
		System.out.println("*****************");
		System.out.println();
		
		
		stringBuilder.append("Sita");
		stringBuilder.append("Sita");
		stringBuilder.append("Sita");
		stringBuilder.append("Sita");
		stringBuilder.append(" ");
		System.out.println("Data= "+stringBuilder);
		System.out.println("Length= "+stringBuilder.length());
		System.out.println("Capacity= "+stringBuilder.capacity());
		

	}
}
