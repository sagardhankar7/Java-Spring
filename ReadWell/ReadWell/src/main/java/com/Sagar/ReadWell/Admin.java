package com.Sagar.ReadWell;

import java.util.List;

public interface Admin {
    void addBook(Book book);
    List<Book> getAllBooks();
    void setDetails(String name);
}
