package com.Sagar.ReadWell;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("myAdmin")
public class MyAdmin implements Admin {
    @Autowired //Todo: Check
    BookList bookList;
    String name;


    @Override
    public void addBook(Book book) {
        bookList.addBook(book);
    }

    @Override
    public List<Book> getAllBooks() {
        return bookList.getAllBooks();
    }

    @Override
    public void setDetails(String name) {
        this.name = name;
    }
}
