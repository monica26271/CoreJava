package com.kn.composition;

public class Book {
	
	Page page;
	public Book( String Content) {
		
		this.page= new Page(Content);
	}
	public void readBook() {
		System.out.println("Reading book in progress............");
		page.displayContent();
	}
	
}
