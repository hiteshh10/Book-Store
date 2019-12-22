package com.bookstore.test;

import java.util.*;
import com.bookstore.dao.*;
import com.bookstore.pojo.*;

public class CustomerTest
{
	public static void main(String[] args) 
	{
		Customer c=new Customer();
		CustomerDaoImpl cd=new CustomerDaoImpl();
		Scanner s=new Scanner(System.in);
		while(true)
		{
			System.out.println("1.Add Customer");
			System.out.println("2.Update Customer");
			System.out.println("3.Delete Customer By Id");
			System.out.println("4.Get All Customer Details");
			System.out.println("5.Search Customer By Id");
			System.out.println("Enter Choice:");
			int choice=s.nextInt();
			
			switch(choice)
			{
				case 1:
					System.out.println("Enter CustomerName:");
					s.nextLine();
					String customerName=s.nextLine();
				
					System.out.println("Enter CustomerAddress:");
					String customerAddress=s.nextLine();
				
					System.out.println("Enter CustomerEmailid:");
					String customerEmailid=s.next();
				
					System.out.println("Eneter CustomerContactno:");
					s.nextLine();
					long customerContactno=s.nextLong();
				
					System.out.println("Enter Username:");
					String username=s.next();
					
					System.out.println("Enter Password:");
					String password=s.next();
					
				
					c.setCustomerName(customerName);
					c.setCustomerAddress(customerAddress);
					c.setCustomerEmailid(customerEmailid);
					c.setCustomerContactno(customerContactno);
					c.setUsername(username);
					c.setPassword(password);
					
					boolean f=cd.addCustomer(c);
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
					
					System.out.println("Enter CustomerId:");
					int customerid=s.nextInt();
					
					System.out.println("Enter CustomerName:");
					s.nextLine();
					customerName=s.nextLine();
				
					System.out.println("Enter CustomerAddress:");
					customerAddress=s.nextLine();
				
					System.out.println("Enter CustomerEmailid:");
					customerEmailid=s.next();
				
					System.out.println("Eneter CustomerContactno:");
					s.nextLine();
					customerContactno=s.nextLong();
				
					System.out.println("Enter Username:");
					username=s.next();
					
					System.out.println("Enter Password:");
					password=s.next();
					
					c.setCustomerId(customerid);
					c.setCustomerName(customerName);
					c.setCustomerAddress(customerAddress);
					c.setCustomerEmailid(customerEmailid);
					c.setCustomerContactno(customerContactno);
					c.setUsername(username);
					c.setPassword(password);
					
					boolean fb=cd.updateCustomer(c);
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
					System.out.println("Enter Customer Id to Delete:");
					customerid=s.nextInt();
					boolean flag =cd.deleteCustomer(customerid);
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
					System.out.println("Customer Details Are:");
					List<Customer> blist=cd.getAllCustomer();
					Iterator it=blist.iterator();
					while(it.hasNext())
					{
						System.out.println(it.next());
					}
					break;
				
				case 5:
					System.out.println("Enter Customer Id to Show record:");
					customerid=s.nextInt();
					c=cd.getCustomerBYId(customerid);
					System.out.println(c);
					break;
		}
	}
}
}