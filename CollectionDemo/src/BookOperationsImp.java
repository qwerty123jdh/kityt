import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.beans.Book;
import com.interfaces.BookOperations;


public class BookOperationsImp implements BookOperations, Serializable {
	
	
	public boolean writeDataToFile(List<Book> books)
	{
		
		try {
			FileOutputStream fo = new FileOutputStream("books.txt");
			ObjectOutputStream oo= new ObjectOutputStream(fo);
			oo.writeObject(books);
			oo.close();
			fo.close();
			return true;
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
		
	}
	
	public List<Book> readDataFromFile()
	{
		List<Book> data= new ArrayList<>();
		
		try {
			FileInputStream fi = new FileInputStream("books.txt");
			ObjectInputStream oi= new ObjectInputStream(fi);
			Object obj= oi.readObject();
			data= (List) obj;
			return data;
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
		
	}

	@Override
	public int addBook(Book book) {
		// TODO Auto-generated method stub
		File file =new File("books.txt");
		List<Book> data= new ArrayList<>();
		boolean found=false;
		if(file.exists())
		{
			 data=readDataFromFile();
			data.add(book);
			found=writeDataToFile(data);
			
		}
		else
		{
				data.add(book);
				 found=writeDataToFile(data);
			
			}
			
		
		if(found)
		{
			return 1;
		}
		else
		return 0;
	}

	@Override
	public boolean deleteBook(Book book) {
		// TODO Auto-generated method stub
		 List<Book> books=readDataFromFile();
		boolean removed=books.remove(book);
		if(removed) {
		  writeDataToFile(books);
			return true;
		}
		else
		return false;
		
	}

	@Override
	public Book findBookById(Book book) {
		// TODO Auto-generated method stub
		List<Book> books=readDataFromFile();
		if(books.contains(book))
		{
			return book;
		}
		else
		return null;
	}

	@Override
	public List<Book> findBooksByName(String book_name) {
		// TODO Auto-generated method stub
		List<Book> book= new ArrayList<>();
		List<Book> ads= new ArrayList<>();
		book =readDataFromFile();
		for(Book bk: book)
		{
			String name=bk.getName();
			if(book_name.equals(name))
			{
				ads.add(bk);
			}
		}
		
		
		return ads;
	}

}
