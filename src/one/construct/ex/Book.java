package one.construct.ex;

public class Book {
    String name;
    String author;
    int pages;

    Book(){
        this("", "", 0);
    }

    Book(String name, String author) {
        this(name, author, 0);
    }

    Book(String name, String author, int pages) {
        this.name = name;
        this.author = author;
        this.pages = pages;
    }

    void displayInfo(){
        System.out.println("제목:" + name + ", 저자:" + author + ", 페이지:" + pages);
    }
}
