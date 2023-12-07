package main.oop.composition;

import java.util.List;

// Library has-a book
public class Library {

    List<Book> books;

    public Library(List<Book> books) {
        this.books = books;
    }

    public List<Book> getLibraryBooks() {
        return books;
    }
}
