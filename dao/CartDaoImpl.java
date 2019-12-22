package com.bookstore.dao;

import java.sql.*;
import java.util.*;

import com.bookstore.pojo.Book;
import com.bookstore.pojo.Cart;
import com.bookstore.utility.DBUtility;

public class CartDaoImpl implements CartDao
{
	Connection con=null;
	String s;
	
	public boolean addToCart(Cart c)
	{
		try
		{
			con=DBUtility.myconnection();
			s="insert into Cart20314(bookid,cusername,quantity) values(?,?,?)";
			PreparedStatement ps=con.prepareStatement(s);
			ps.setInt(1,c.getBookId());
			ps.setString(2,c.getUsername());
			ps.setInt(3,c.getQuantity());
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
			System.out.println(e);
		}
		return false;
	}
	
	public List<Cart> showCart(String username)
	{
		List<Cart> clist=new ArrayList<Cart>();
		try
		{
			con=DBUtility.myconnection();
			s="select b.bookname,b.bookprice,b.bookid,c.quantity,c.cusername,c.cartid from Cart20314 c,Book20314 b where b.bookid=c.bookid and c.cusername=?";
			PreparedStatement ps=con.prepareStatement(s);
			ps.setString(1,username);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				Cart c=new Cart();
				c.setBookId(rs.getInt("bookid"));
				c.setCartId(rs.getInt("cartid"));
				c.setBookName(rs.getString("bookname"));
				c.setBookPrice(rs.getInt("bookprice"));
				c.setQuantity(rs.getInt("quantity"));
				c.setUsername(rs.getString("cusername"));
				clist.add(c);
			}
			return clist;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
	
	public boolean deleteCart(int cartid) 
	{
		try
		{
			con=DBUtility.myconnection();
			s="delete from Cart20314 where cartid=?";
			PreparedStatement ps=con.prepareStatement(s);
			ps.setInt(1,cartid);
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
			System.out.println(e); 
		}
		return false;
	}
	
	
}
