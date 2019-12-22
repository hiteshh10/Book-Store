package com.bookstore.test;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.bookstore.dao.*;
import com.bookstore.pojo.*;

public class BookTest 
{
	public static void main(String[] args) 
	{
		Book b=new Book();
		BookDaoImpl bd=new BookDaoImpl();
		Scanner s=new Scanner(System.in);
		while(true)
		{
			System.out.println("1.Add Book");
			System.out.println("2.Update Book");
			System.out.println("3.Delete Book By Id");
			System.out.println("4.Get Book Details");
			System.out.println("5.Search Book By Id");
			System.out.println("Enter Choice:");
			int choice=s.nextInt();
			
			switch(choice)
			{
				case 1:
					System.out.println("Enter Book Name:");
					s.nextLine();
					String bookName=s.nextLine();
				
					System.out.println("Enter Book Author:");
					String bookAuthor=s.nextLine();
				
					System.out.println("Enter BookPrice:");
					double bookPrice=s.nextDouble();
				
					System.out.println("Eneter BookPublisher:");
					s.nextLine();
					String bookPublisher=s.nextLine();
				
					System.out.println("Enter BookQuantity:");
					int bookQuantity=s.nextInt();
				
					System.out.println("Enter BookCategory:");
					s.nextLine();
					String bookCategory=s.nextLine();
					
					System.out.println("Enter BookDescription:");
					String bookDesc=s.nextLine();
					
					b.setBookname(bookName);
					b.setBookauthor(bookAuthor);
					b.setBookprice(bookPrice);
					b.setBookpublisher(bookPublisher);
					b.setBookquantity(bookQuantity);
					b.setBookcategory(bookCategory);
					b.setBookdesc(bookDesc);
					
					boolean f=bd.addBook(b);
					if(f==true)
					{
						System.out.println("Record Added");
					}
					else
					{
						System.out.println("Record not Added");
					}
				break;
				
				
			case 2:
				System.out.println("Enter BookId:");
				int bookId=s.nextInt();
				
				System.out.println("Enter BookName:");
				s.nextLine();
				bookName=s.nextLine();
				
				System.out.println("Enter BookAuthor:");
				bookAuthor=s.nextLine();
				
				System.out.println("Enter BookPrice:");
				bookPrice=s.nextDouble();
				
				System.out.println("Eneter BookPublisher:");
				s.nextLine();
				bookPublisher=s.nextLine();
				
				System.out.println("Enter BookQuantity:");
				bookQuantity=s.nextInt();
				
				System.out.println("Enter BookCategory:");
				s.nextLine();
				bookCategory=s.nextLine();
				
				System.out.println("Enter BookDescription:");
				bookDesc=s.nextLine();
				
				b.setBookid(bookId);
				b.setBookname(bookName);
				b.setBookauthor(bookAuthor);
				b.setBookprice(bookPrice);
				b.setBookpublisher(bookPublisher);
				b.setBookquantity(bookQuantity);
				b.setBookcategory(bookCategory);
				b.setBookdesc(bookDesc);
				
				boolean fb=bd.updateBook(b);
				if(fb==true)
				{
					System.out.println("Record Updated");
				}
				else
				{
					System.out.println("Record not Updated");
				}
				
				break;
				
				
			case 3:
				System.out.println("Enter BookId to Delete:");
				bookId=s.nextInt();
				boolean flag =bd.deleteBook(bookId);
				if(flag==true)
				{
					System.out.println("Record Deleted");
				}
				else
				{
					System.out.println("Record Not Deleted");
				}
				break;
				
				
			case 4:
				System.out.println("Book Details Are:");
				List<Book> blist=bd.getAllBooks();
				/*for(int i=0;i<blist.size();i++)
				{
					System.out.println(blist.get(i));
				}*/
				Iterator it=blist.iterator();
				while(it.hasNext())
				{
					System.out.println(it.next());
				}
				break;
				
			case 5:
				System.out.println("Enter Book Id to Show record:");
				bookId=s.nextInt();
				b=bd.getBookById(bookId);
				System.out.println(b);
				
				break;
				
				
			}
		}
	}
}
