package com.bookstore.test;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.bookstore.dao.*;
import com.bookstore.pojo.*;

public class CartTest 
{
	public static void main(String[] args) 
	{
		Cart c=new Cart();
		BookDaoImpl bd=new BookDaoImpl();
		CartDaoImpl cdao=new CartDaoImpl();
		Scanner s=new Scanner(System.in);
		while(true)
		{
			
			System.out.println("1.Show Book List");
			System.out.println("2.Add to Cart");
			System.out.println("3.Show Cart");
			System.out.println("4.Delete Cart");
			System.out.println("Enter Choice:");
			int choice=s.nextInt();
			
			switch(choice)
			{
				case 1:
					System.out.println("Booklist is:");
					List<Book> blist=bd.getAllBooks();
					for(Book b:blist)
					{
						System.out.println(b);
					}
				case 2:
					System.out.println("Enter Bookid to add to cart:");
					int bid=s.nextInt();
					System.out.println("Enter Username:");
					String username=s.next();
					System.out.println("Enter Quantity:");
					int bquantity=s.nextInt();
					c.setBookId(bid);
					c.setUsername(username);
					c.setQuantity(bquantity);
					boolean flag=cdao.addToCart(c);
					if(flag==true)
					{
						System.out.println("Added to Cart");
					}
					else
					{
						System.out.println("Not Inserted in Cart ");
					}
				case 3:
					System.out.println("Enter username to Show Cart:");
					username=s.next();
					List<Cart> clist=cdao.showCart(username);
					for(Cart c1:clist)
					{
						System.out.println(c1);
					}
					
					break;
				case 4:
					System.out.println("Enter CartId to Delete:");
					int cartid=s.nextInt();
					flag =bd.deleteBook(cartid);
					if(flag==true)
					{
						System.out.println("Record Deleted");
					}
					else
					{
						System.out.println("Record Not Deleted");
					}
					break;
					
			}
		
		}
		
	}
}
