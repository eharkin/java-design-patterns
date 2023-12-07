package main.oop.composition;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        Book book1 = new Book("Biography", "Josh");
        Book book2 = new Book("Science", "Tess");

        List<Book> bookList = new ArrayList<>();

        bookList.add(book1);
        bookList.add(book2);

        Library library = new Library(bookList);
        library.getLibraryBooks().forEach(book -> System.out.printf(
                "Name: %s  Author: %s", book.getName(), book.getAuthor()));
    }
}
