import java.util.Scanner;
class Bookinventory{
    String title;
    String author;
    String publisher;
    String isbn;
    int year;
    int price;
    int quantity;
    int books = 10;
    Scanner sc = new Scanner(System.in);
   

    public String getTitle(){
        return this.title;
    }
    public void setTitle(String title){
        this.title = title;
    }

    public String getAuthor(){
        return this.author;
    }
    public void setAuthor(String Author){
        this.author = author;
    }

    public String getPublisher(){
        return this.publisher;
    }
    public void setPublisher(String publisher){
        this.publisher = publisher;
    }

    public String getIsbn(){
        return this.isbn;
    }
    public void setIsbn(String isbn){
        this.isbn = isbn;
    }

    public int getYear(){
        return this.year;
    }
    public void setYear(int year){
        this.year = year;
    }

    void IncreaseQuantity(){
        System.out.println("Enter the quantity to be increased");
        int x = sc.nextInt();
        System.out.println("Total number of books :"+(x+books)); 
        System.out.println("Total cost of book is :"+(x+books)*200);     
    }

    void DecreaseQuantity(){
        System.out.println("Enter the quantity to be decreased");
        int x = sc.nextInt();
        System.out.println("Total number of books :"+(books-x)); 
        System.out.println("Total cost of book is :"+(books-x)*200);      
    }


}
class Book{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Bookinventory bi = new Bookinventory();
        System.out.println("Enter title of the book");
        bi.setTitle(sc.nextLine());
        System.out.println("Enter name of the author of the book.");
        bi.setAuthor(sc.nextLine());
        System.out.println("Enter the name of the publisher of the book.");
        bi.setPublisher(sc.nextLine());
        System.out.println("Enter the ISBN number of the book");
        bi.setIsbn(sc.nextLine());
        System.out.println("Enter the year in which the book was published.");
        bi.setYear(sc.nextInt());

        String title = bi.getTitle();
        String author = bi.getAuthor();
        String publisher = bi.getPublisher();
        String isbn = bi.getIsbn();
        int year = bi.getYear();

        System.out.println("choose option :");
        System.out.println("1. Increase quantity of book");
        System.out.println("2. Decrease quantity of book");

        int num = sc.nextInt();
        switch(num){
        case 1: bi.IncreaseQuantity(); break;
        case 2: bi.DecreaseQuantity(); break;
        }

    }
}