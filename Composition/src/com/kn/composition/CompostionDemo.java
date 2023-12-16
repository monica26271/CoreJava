package com.kn.composition;

public class CompostionDemo {

	public static void main(String[] args) {
		Book book=new Book("Impossible");
		
		book.readBook();
		book=null;
		if(book==null) {
			System.out.println("Book is lost");
		}
		

	}

}
