/*This class represents a library and contains a list of Book objects. 
The class should have methods to add and remove books from the library,
search for books by title or author, and get the total number of books 
in the library. The class should also have a Librarian object to 
represent the librarian who manages the library.*/
package oopj.assignment4_2;

public class Library {
    String id;
    String name;
    String email;
    String mobile;

    public Library(String id, String name, String email, String mobile) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.mobile = mobile;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    
    
}
