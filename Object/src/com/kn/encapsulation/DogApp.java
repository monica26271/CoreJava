package com.kn.encapsulation;

public class DogApp {

	public static void main(String[] args) {
		
		Dog d1=new Dog("Zoe","Gold",1,"Lab");
		Dog d2=new Dog("Sparkle","Black",3,"Lab");
		Dog d3=new Dog("Cristal","Brown",2,"Lab");
		
		System.out.println("Name = "+d1.getName());
		System.out.println("Color = "+d1.getColor());
		System.out.println("Age = "+d1.getAge());
		System.out.println("Breed = "+d1.getBreed());
		System.out.println();
		
		System.out.println("Name = "+d2.getName());
		System.out.println("Color = "+d2.getColor());
		System.out.println("Age = "+d2.getAge());
		System.out.println("Breed = "+d2.getBreed());
		System.out.println();
		
		System.out.println("Name = "+d3.getName());
		System.out.println("Color = "+d3.getColor());
		System.out.println("Age = "+d3.getAge());
		System.out.println("Breed = "+d3.getBreed());
		

	}

	

}
