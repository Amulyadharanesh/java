public class Book {
    String bookName;
    int noOfPages;
    String author;
    int price;
    int publishedYear;
    String publisher;
    String type;

    
    public Book(String bookName, int noOfPages, String author, int price, int publishedYear, String publisher, String type) {
        this.bookName = bookName;
        this.noOfPages = noOfPages;
        this.author = author;
        this.price = price;
        this.publishedYear = publishedYear;
        this.publisher = publisher;
        this.type = type;
    }

    
    public void printBookDetails() {
        System.out.println("Book Name: " + this.bookName);
        System.out.println("Number of Pages: " + this.noOfPages);
        System.out.println("Author: " + this.author);
        System.out.println("Price: $" + this.price);
        System.out.println("Published Year: " + this.publishedYear);
        System.out.println("Publisher: " + this.publisher);
        System.out.println("Type: " + this.type);
        System.out.println();
    }

    public static void main(String[] args) {
        Book book1 = new Book("Bhagavad Gita", 1106, "Vyasa", 320, 1972, "Prakash", "Sanskrit epic poem");
        Book book2 = new Book("Interpreter of Maladies", 198, "Jhumpa Lahiri", 18, 1999, "Houghton Mifflin", "Short Stories");
        Book book3 = new Book("The White Tiger", 321, "Aravind Adiga", 25, 2008, "HarperCollins", "Novel");
        Book book4 = new Book("A Suitable Boy", 1474, "Vikram Seth", 30, 1993, "Viking", "Novel");
        Book book5 = new Book("Train to Pakistan", 244, "Khushwant Singh", 15, 1956, "Grove Press", "Historical Fiction");
        Book book6 = new Book("The Palace of Illusions", 360, "Chitra Banerjee Divakaruni", 20, 2008, "Anchor Books", "Mythology");
        Book book7 = new Book("The Inheritance of Loss", 333, "Kiran Desai", 22, 2006, "Atlantic Books", "Novel");

        book1.printBookDetails();
        book2.printBookDetails();
        book3.printBookDetails();
        book4.printBookDetails();
        book5.printBookDetails();
        book6.printBookDetails();
        book7.printBookDetails();
    }
}

