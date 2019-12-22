package com.bookstore.test;

import java.util.*;

import com.bookstore.dao.*;
import com.bookstore.pojo.*;

public class OrderTest 
{
	public static void main(String[] args) 
	{
		Order o=new Order();
		OrderDaoImpl od=new OrderDaoImpl();
		Scanner s=new Scanner(System.in);
		while(true)
		{
			System.out.println("1.Place Order");
			System.out.println("2.Show Order");
			System.out.println("3.Show Order By Username");
			System.out.println("Enter Your Choice:");
			int choice=s.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter username to insert:");
				String cusername=s.next();
				boolean flag=od.placeOrder(cusername);
				if(flag==true)
				{
					System.out.println("Order Placed");
				}
				else
				{
					System.out.println("Order Not Placed");
				}
			case 2:
				System.out.println("Order Details Are:");
				List<Order> olist=od.showOrder();
				Iterator it=olist.iterator();
				while(it.hasNext())
				{
					System.out.println(it.next());
				}
				break;
			case 3:
				System.out.println("Enter Username get Details:");
				cusername=s.next();
				List<Order> list=od.showOrderByUsername(cusername);
				Iterator t=list.iterator();
				while(t.hasNext())
				{
					System.out.println(t.next());
				}
				break;
				
			}
		}
	}
}
