/*This class represents a book and contains information such as the title,
author, ISBN, and publisher. The class should also have a method to get the
 number of copies of the book in the library.*/

package oopj.assignment4_2;

public class Book {
    String id;
    String title;
    String author;
    String publisher;
    int numberOfCopies;

    public Book(String id, String title, String author, String publisher, Boolean isAvail, int numberOfCopies) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.numberOfCopies = numberOfCopies;
    }

    public Book() {
		
	}

	public String getBookId() {
        return id;
    }

    public void setBookId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher(String publisher) {
        return Publisher();
    }

	public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void numberOfBooks(int numberOfCopies){
        this.numberOfCopies = numberOfCopies;
    }

	public boolean DeleteABook(int book_id) {
		// TODO Auto-generated method stub
		return false;
	}


}