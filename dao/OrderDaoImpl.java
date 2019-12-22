package com.bookstore.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bookstore.pojo.*;
import com.bookstore.utility.DBUtility;

public class OrderDaoImpl implements OrderDao
{
	Connection con=null;
	String s,s1;
	
	public boolean placeOrder(String cusername) 
	{
		double total=0;
		try
		{
			con=DBUtility.myconnection();
			s="select sum(b.bookprice * c.quantity)as total from Book20314 b,Cart20314 c where b.bookid=c.bookid and c.cusername=?";
			PreparedStatement ps=con.prepareStatement(s);
			ps.setString(1,cusername);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				total=rs.getDouble("total");
			}
			s1="insert into Order20314(totalbill,cusername,orderstatus) values(?,?,?)";
			PreparedStatement pr=con.prepareStatement(s1);
			pr.setDouble(1,total);
			pr.setString(2,cusername);
			pr.setString(3,"Processing");
			int x=pr.executeUpdate();
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
	
	public List<Order> showOrder() 
	{
		try
		{
			con=DBUtility.myconnection();
			List<Order> olist=new ArrayList<Order>();
			s="Select * from Order20314";
			PreparedStatement ps=con.prepareStatement(s);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				Order o=new Order();
				o.setOrderid(rs.getInt("orderid"));
				o.setTotalbill(rs.getDouble("totalbill"));
				o.setUsername(rs.getString("cusername"));
				o.setOrderstatus(rs.getString("orderstatus"));
				olist.add(o);
			}
			return olist;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}

	public List<Order> showOrderByUsername(String cusername)
	{
		try
		{
			List<Order> olist=new ArrayList<Order>();
			con=DBUtility.myconnection();
			s="select * from Order20314 where cusername=?";
			PreparedStatement ps=con.prepareStatement(s);
			ps.setString(1,cusername);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				Order o=new Order();
				o.setOrderid(rs.getInt("orderid"));
				o.setTotalbill(rs.getDouble("totalbill"));
				o.setUsername(rs.getString("cusername"));
				o.setOrderstatus(rs.getString("orderstatus"));
				olist.add(o);
			}return olist;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
	
	
}
