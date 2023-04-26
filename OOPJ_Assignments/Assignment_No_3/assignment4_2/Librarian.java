/* This class represents a librarian and contains information such as the
name and contact details. The class should have methods to add and remove 
books from the library, search for books by title or author, and get 
the total number of books in the library.*/
package oopj.assignment4_2;

public class Librarian {
 String name;
 long mobNo;
 String NewAuthor;
 String NewTitle;
 String NewSubject;
 int quantity;
 
 public Librarian() {
		super();
	}
 
 public void AddBook(ArrayList<Books> Book  ,String NewAuthor ,String NewTitle ,String NewSubject , int quantity) {

	 Book LastBook = Librarian .get(Book .size()-1);
	    int book_id = Book.getBookId();
	    book_id += 1;
	    
	    Book NewBook = new Book(book_id, NewTitle, NewAuthor, NewSubject, quantity);
	    dbConnectivity db = new dbConnectivity();
	    NewBook.Book(book_id, NewTitle, NewAuthor, NewSubject, quantity);
	    Book.add(NewBook);

	}
		
	public boolean DeleteBook(ArrayList<Books> BooksList, int book_id) {

	    boolean deleted=false;
	     Book ToDelete=new Book();
	   
	     boolean result =ToDelete.DeleteABook(book_id);
	     if(result == true) {
	     for (Book B : BooksList) {
	         if (B.getBookId() == book_id) {
	             
	             ToDelete=B;
	             break;
	         }
	     }

	      BooksList.remove(ToDelete);
	      deleted=true;
	     }
	      
}
//add, remove bookssearch-title/author, total books
