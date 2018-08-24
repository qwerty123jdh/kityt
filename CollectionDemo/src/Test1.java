import java.io.File;
import java.util.List;
import java.util.Scanner;

import com.beans.Book;

public class Test1 {
	
	public static void main(String[] args) {
		BookOperationsImp bi= new BookOperationsImp();
		BookIOImplementation br= new BookIOImplementation();
		
		
		Scanner s= new Scanner(System.in);
		System.out.println(" Enter 1 to add  or 2 to update 3 to find");
		int n= s.nextInt();
		if(n==1)
		{
			Book book= br.getBook();
			bi.addBook(book);
		}
		
		if (n==2)
		{
			 Scanner w= new Scanner(System.in);
	    	   System.out.println("enter the isbn");
	    	   int isbn= w.nextInt();
	    	   System.out.println("enter the name of book");
	    	   String name= w.next();
	    	   System.out.println("enter the publication");
	    	   String pub= w.next();
	    	   System.out.println("enter the publication");
	    	   double price= w.nextDouble();
	    	   Book bk= new Book(isbn,name,pub,price);
	    	   bi.deleteBook(bk);
		}
		
		if (n==3)
		{
			 Scanner w= new Scanner(System.in);
	    	   System.out.println("enter the book name");
	    	   String name= w.next();
	    	  List<Book> newbook= bi.findBooksByName(name);
	    	  br.printBook(newbook);
		}
		
		
		
	}

}
