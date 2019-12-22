package com.bookstore.dao;

import java.sql.*;
import java.util.*;
import com.bookstore.pojo.Book;
import com.bookstore.utility.DBUtility;

public class BookDaoImpl implements BookDao
{
	Connection con=null;
	String s;
	
	public boolean addBook(Book b)
	{
		try
		{
			con=DBUtility.myconnection();
			s="insert into Book20314(bookname,bookauthor,bookprice,bookpublisher,bookquantity,"
					+ "bookcategory,bookdesc) values(?,?,?,?,?,?,?)";
		
			PreparedStatement ps=con.prepareStatement(s);
			
			ps.setString(1,b.getBookname());
			ps.setString(2,b.getBookauthor());
			ps.setDouble(3,b.getBookprice());
			ps.setString(4,b.getBookpublisher());
			ps.setInt(5,b.getBookquantity());
			ps.setString(6,b.getBookcategory());
			ps.setString(7,b.getBookdesc());
			
			int x=ps.executeUpdate();
			if(x>0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}return false;
	}

	public boolean updateBook(Book b) 
	{
		try
		{
			con=DBUtility.myconnection();
			s="update Book20314 set bookname=?,bookauthor=?,bookprice=?,bookpublisher=?,bookquantity=?,"
					+ "bookcategory=?,bookdesc=? where bookid=?";
			
			PreparedStatement ps=con.prepareStatement(s);
			ps.setString(1,b.getBookname());
			ps.setString(2,b.getBookauthor());
			ps.setDouble(3,b.getBookprice());
			ps.setString(4,b.getBookpublisher());
			ps.setInt(5,b.getBookquantity());
			ps.setString(6,b.getBookcategory());
			ps.setString(7,b.getBookdesc());
			ps.setInt(8,b.getBookid());
			
			int x=ps.executeUpdate();
			if(x>0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
			catch(Exception e)
			{
				e.printStackTrace();
			}return false;
		}
		
	
	public boolean deleteBook(int bookid) 
	{
		try
		{
			con=DBUtility.myconnection();
			s="delete from Book20314 where bookid=?";
			PreparedStatement ps=con.prepareStatement(s);
			ps.setInt(1,bookid);
			int x=ps.executeUpdate();
			if(x>0)
			{
				return true;
			}
			else 
			{
				return false;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}

public List<Book> getAllBooks()
	{
		try
		{
			List<Book> booklist=new ArrayList<Book>();
			con=DBUtility.myconnection();
			s="Select * from Book20314";
			PreparedStatement ps=con.prepareStatement(s);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				Book b=new Book();
				b.setBookid(rs.getInt("bookid"));
				b.setBookname(rs.getString("bookname"));
				b.setBookauthor(rs.getString("bookauthor"));
				b.setBookprice(rs.getDouble("bookprice"));
				b.setBookpublisher(rs.getString("bookpublisher"));
				b.setBookquantity(rs.getInt("bookquantity"));
				b.setBookcategory(rs.getString("bookcategory"));
				b.setBookdesc(rs.getString("bookdesc"));
				booklist.add(b);
				
			}
			return booklist;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}

	public Book getBookById(int bookid) 
	{
		Book b=new Book();
		try
		{
			con=DBUtility.myconnection();
			s="select * from Book20314 where bookid=?";
			PreparedStatement ps=con.prepareStatement(s);
			ps.setInt(1, bookid);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				b.setBookid(rs.getInt(1));
				b.setBookname(rs.getString(2));
				b.setBookauthor(rs.getString(3));
				b.setBookprice(rs.getDouble(4));
				b.setBookpublisher(rs.getString(5));
				b.setBookquantity(rs.getInt(6));
				b.setBookcategory(rs.getString(7));
				b.setBookdesc(rs.getString(8));
			}
			return b;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
}
	
