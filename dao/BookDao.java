package com.bookstore.dao;

import java.util.*;
import com.bookstore.pojo.*;

public interface BookDao 
{
	boolean addBook(Book book);
	boolean deleteBook(int bookid);
	boolean updateBook(Book book);
	Book getBookById(int bookid);
	List<Book> getAllBooks();
}
