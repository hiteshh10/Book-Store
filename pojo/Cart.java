package com.bookstore.pojo;

public class Cart
{
	private int cartId;
	private int bookId;
	private int quantity;
	private String username;
	private String bookName;
	private int bookPrice;
	
	
	public int getCartId() 
	{
		return cartId;
	}
	public void setCartId(int cartId) 
	{
		this.cartId = cartId;
	}
	public int getBookId() 
	{
		return bookId;
	}
	public void setBookId(int bookId) 
	{
		this.bookId = bookId;
	}
	public int getQuantity() 
	{
		return quantity;
	}
	public void setQuantity(int quantity) 
	{
		this.quantity = quantity;
	}
	public String getUsername() 
	{
		return username;
	}
	public void setUsername(String username) 
	{
		this.username = username;
	}
	public String getBookName() 
	{
		return bookName;
	}
	public void setBookName(String bookName) 
	{
		this.bookName = bookName;
	}
	public int getBookPrice() 
	{
		return bookPrice;
	}
	public void setBookPrice(int bookPrice) 
	{
		this.bookPrice = bookPrice;
	}
	@Override
	public String toString() 
	{
		return "Cart [cartId=" + cartId + ", bookId=" + bookId + ", quantity=" + quantity + ", username=" + username
				+ ", bookName=" + bookName + ", bookPrice=" + bookPrice + "]";
	}
	
	
	
	
}