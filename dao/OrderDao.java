package com.bookstore.dao;

import java.util.*;

import com.bookstore.pojo.*;

public interface OrderDao 
{
	boolean placeOrder(String cusername);
	List<Order> showOrder();
	List<Order> showOrderByUsername(String cusername);
}
