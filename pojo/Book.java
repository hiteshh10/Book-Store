package com.bookstore.pojo;

public class Book 
{
	private int bookId;
	private String bookName;
	private String bookAuthor;
	private double bookPrice;
	private String bookPublisher;
	private int bookQuantity;
	private String bookCategory;
	private String bookDesc;
	
	public int getBookid()
	{
		return bookId;
	}
	public void setBookid(int bookid) 
	{
		this.bookId = bookid;
	}
	public String getBookname()
	{
		return bookName;
	}
	public void setBookname(String bookname) 
	{
		this.bookName = bookname;
	}
	public String getBookauthor()
	{
		return bookAuthor;
	}
	public void setBookauthor(String bookauthor) 
	{
		this.bookAuthor = bookauthor;
	}
	
	public double getBookprice()
	{
		return bookPrice;
	}
	public void setBookprice(double bookprice) 
	{
		this.bookPrice = bookprice;
	}
	public String getBookpublisher() 
	{
		return bookPublisher;
	}
	public void setBookpublisher(String bookpublisher) 
	{
		this.bookPublisher = bookpublisher;
	}
	public int getBookquantity() 
	{
		return bookQuantity;
	}
	public void setBookquantity(int bookquantity) 
	{
		this.bookQuantity = bookquantity;
	}
	public String getBookcategory() 
	{
		return bookCategory;
	}
	public void setBookcategory(String bookcategory) 
	{
		this.bookCategory = bookcategory;
	}
	public String getBookdesc() 
	{
		return bookDesc;
	}
	public void setBookdesc(String bookdesc) 
	{
		this.bookDesc = bookdesc;
	}
	
	public String toString()
	{
		return "Book Id=" + bookId + ", Book Name=" + bookName + ", Book Author=" + bookAuthor + ", Book Price="
				+ bookPrice + ", Book Publisher=" + bookPublisher + ", Book Quantity=" + bookQuantity + ", Book Category="
				+ bookCategory + ", Book Description=" + bookDesc ;
	}
	
}
 