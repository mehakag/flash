package com.sample.model;

public class Book {

	private int isdn;
	private String bookName;
	private String author;
	private int price;

	public Book(int isdn, String bookName, String author, int price) {
		super();
		this.isdn = isdn;
		this.bookName = bookName;
		this.author = author;
		this.price = price;
	}

	/**
	 * This method is used to the ISDN of the book.
	 * 
	 * @return isdn
	 */
	public int getIsdn() {
		return isdn;
	}

	/**
	 * This method is used to set the isdn.
	 * 
	 * @param isdn
	 */
	public void setIsdn(int isdn) {
		this.isdn = isdn;
	}

	/**
	 * This method return the book name.
	 * 
	 * @return bookName.
	 */
	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
