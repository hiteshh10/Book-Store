package com.bookstore.pojo;

public class Customer
{
	private int customerId;
	private String customerName;
	private String customerAddress;
	private String customerEmailid;
	private long customerContactno;
	private String username;
	private String password;
	
	public int getCustomerId() 
	{
		return customerId;
	}
	public void setCustomerId(int customerId) 
	{
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public String getCustomerEmailid() {
		return customerEmailid;
	}
	public void setCustomerEmailid(String customerEmailid) {
		this.customerEmailid = customerEmailid;
	}
	public long getCustomerContactno() {
		return customerContactno;
	}
	public void setCustomerContactno(long customerContactno) {
		this.customerContactno = customerContactno;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password=password;
	}
	public String toString() 
	{
		return "Customer Id=" + customerId + ", Customer Name=" + customerName + ", Customer Address="
				+ customerAddress + ", customerEmailid=" + customerEmailid + ", customerContactno=" + customerContactno
				+ ", username=" + username + " Password="+password;
	}
	
	
	
}
