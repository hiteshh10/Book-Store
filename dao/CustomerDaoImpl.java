package com.bookstore.dao;

import java.sql.*;
import java.util.*;
import com.bookstore.pojo.*;
import com.bookstore.utility.*;

public class CustomerDaoImpl implements CustomerDao
{
	Connection con=null;
	String s;
	
	public boolean addCustomer(Customer c)
	{
		try
		{
			con=DBUtility.myconnection();
			s="insert into Customer20314(customername,customeraddress,customeremailid,"
				+ "customercontactno,username,password) values(?,?,?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(s);
			
			ps.setString(1,c.getCustomerName());
			ps.setString(2,c.getCustomerAddress());
			ps.setString(3,c.getCustomerEmailid());
			ps.setLong(4,c.getCustomerContactno());
			ps.setString(5,c.getUsername());
			ps.setString(6,c.getPassword());
			
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

	public boolean updateCustomer(Customer c) 
	{
		try
		{
			con=DBUtility.myconnection();
			s="update Customer20314 set customername=?,customeraddress=?,customeremailid=?,"
					+ "customercontactno=?,username=?,password=? where customerid=?";
			
			PreparedStatement ps=con.prepareStatement(s);
			ps.setString(1,c.getCustomerName());
			ps.setString(2,c.getCustomerAddress());
			ps.setString(3,c.getCustomerEmailid());
			ps.setLong(4,c.getCustomerContactno());
			ps.setString(5,c.getUsername());
			ps.setString(6,c.getPassword());
			ps.setInt(7,c.getCustomerId());
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

	public boolean deleteCustomer(int customerid)
	{
		try
		{
			con=DBUtility.myconnection();
			s="delete from Customer20314 where customerid=?";
			PreparedStatement ps=con.prepareStatement(s);
			ps.setInt(1,customerid);
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

	public Customer getCustomerBYId(int customerid)
	{
		Customer c=new Customer();
		try
		{
			con=DBUtility.myconnection();
			s="select * from Customer20314 where customerid=?";
			PreparedStatement ps=con.prepareStatement(s);
			ps.setInt(1, customerid);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				c.setCustomerId(rs.getInt(1));
				c.setCustomerName(rs.getString(2));
				c.setCustomerAddress(rs.getString(3));
				c.setCustomerEmailid(rs.getString(4));
				c.setCustomerContactno(rs.getLong(5));
				c.setUsername(rs.getString(6));
				c.setPassword(rs.getString(7));
			}
			return c;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}

	
	public List<Customer> getAllCustomer() 
	{
		try
		{
			List<Customer> customerlist=new ArrayList<Customer>();
			con=DBUtility.myconnection();
			s="Select * from Customer20314";
			PreparedStatement ps=con.prepareStatement(s);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				Customer c=new Customer();
				c.setCustomerId(rs.getInt(1));
				c.setCustomerName(rs.getString(2));
				c.setCustomerAddress(rs.getString(3));
				c.setCustomerEmailid(rs.getString(4));
				c.setCustomerContactno(rs.getLong(5));
				c.setUsername(rs.getString(6));
				c.setPassword(rs.getString(7));
				customerlist.add(c);
				
			}
			return customerlist;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
		
	}


	
}
	

