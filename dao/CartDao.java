package com.bookstore.dao;

import java.util.*;

import com.bookstore.pojo.*;

public interface CartDao 
{
	boolean addToCart(Cart c);
	List<Cart> showCart(String username);
	boolean deleteCart(int cartid);
	
}
