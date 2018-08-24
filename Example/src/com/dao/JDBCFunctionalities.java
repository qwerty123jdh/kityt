package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.beans.Book;

public class JDBCFunctionalities implements BookDAO {
	

	@Override
	public boolean addBook(Book book) {
		// TODO Auto-generated method stub
		String INSERT_BOOK=" insert into book1 values(?,?,?,?)";
		boolean s=false;
		try {
			PreparedStatement ps= MyConnection.getMyConnection().prepareStatement(INSERT_BOOK);
			ps.setString(1, book.getIsbn());
			ps.setString(2, book.getName());
			ps.setString(3, book.getPublication());
			ps.setString(4, book.getAuthor());
			s=ps.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return s;
	}

	@Override
	public int updateBook(Book book, String ISBN) {
		// TODO Auto-generated method stub
		Book books= new Book();
		String UPDATE_BOOK = "update book1 set name=?, set author=? where isbn=? ";
		int row=0;
		try {
			PreparedStatement ps= MyConnection.getMyConnection().prepareStatement(UPDATE_BOOK);
			ps.setString(1, book.getName());
			ps.setString(2, book.getAuthor());
			ps.setString(3, ISBN);
			 row= ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return row;
	}

	@Override
	public int deleteBook(String ISBN) {
		// TODO Auto-generated method stub
		String DELETE_BOOK="delete book1 where isbn=?";
		int row=0;
		try {
			PreparedStatement ps= MyConnection.getMyConnection().prepareStatement(DELETE_BOOK);
			ps.setString(1, ISBN);
			row=ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return row;
	}

	@Override
	public Book findBookByISBN(String ISBN) {
		// TODO Auto-generated method stub
		
		String FIND_BOOK="select * from book1 where isbn=?";
		PreparedStatement ps;
		Book books= new Book();
		try {
			
			ps = MyConnection.getMyConnection().prepareStatement(FIND_BOOK);
			ps.setString(1, ISBN);
			ResultSet set =ps.executeQuery();
			while(set.next())
			{
			 books= new Book(set.getString(1),set.getString(2),set.getString(3),set.getString(4));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return books;
	}

	@Override
	public List<Book> findBooksByName(String name) {
		// TODO Auto-generated method stub
		String FIND_BOOK_BY_NAME=" select * from book1 where name=?";
		List<Book> books= new ArrayList();
		try {
			PreparedStatement ps = MyConnection.getMyConnection().prepareStatement(FIND_BOOK_BY_NAME);
			ps.setString(1, name);
			ResultSet set=ps.executeQuery();
			while (set.next()) {
				Book book = new Book(set.getString(1),set.getString(2),set.getString(3),set.getString(4));
				books.add(book);
				
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return books;
	}

	@Override
	public List<Book> findAllBooks() {
		// TODO Auto-generated method stub
		String FIND_ALL_BOOKS= "select * from book1";
		List<Book> books= new ArrayList();
		try {
			PreparedStatement ps= MyConnection.getMyConnection().prepareStatement(FIND_ALL_BOOKS);
			ResultSet set=ps.executeQuery();
			while (set.next()) {
				Book book = new Book(set.getString(1),set.getString(2),set.getString(3),set.getString(4));
				books.add(book);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return books;
	}

	@Override
	public List<Book> findBooksByAuthor(String auth_name) {
		// TODO Auto-generated method stub
		String FIND_BOOK_BY_AUTHOR= "select * from book1 where author=?";
		List<Book> books= new ArrayList();
		try {
			PreparedStatement ps = MyConnection.getMyConnection().prepareStatement(FIND_BOOK_BY_AUTHOR);
			ps.setString(1, auth_name);
			ResultSet set=ps.executeQuery();
			while (set.next()) {
				Book book = new Book(set.getString(1),set.getString(2),set.getString(3),set.getString(4));
				books.add(book);
				
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return books;
		
	}

}
