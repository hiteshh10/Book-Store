package com.bookstore.pojo;

public class Order
{
	private int orderId;
	private double totalBill;
	private String cusername,orderstatus;

	public int getOrderid()
	{
		return orderId;
	}
	public void setOrderid(int orderid) 
	{
		this.orderId = orderid;
	}
	public double getTotalbill() 
	{
		return totalBill;
	}
	public void setTotalbill(double totalbill) 
	{
		this.totalBill = totalbill;
	}
	public String getcUsername() 
	{
		return cusername;
	}
	public void setUsername(String cusername) 
	{
		this.cusername = cusername;
	}
	public String getOrderstatus() 
	{
		return orderstatus;
	}
	public void setOrderstatus(String orderstatus) 
	{
		this.orderstatus = orderstatus;
	}
	
	public String toString() 
	{
		return "Order [orderid=" + orderId + ", totalbill=" + totalBill + ", username=" + cusername + ", orderstatus="
				+ orderstatus + "]";
	}
	
	
}
