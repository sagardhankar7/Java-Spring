package com.Sagar.ReadWell;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SimpleStudent implements Student{
    BookList bookList;
    String name;

    @Override
    public void issueBook(Book book) {
        bookList.addBook(book);
    }

    @Override
    public List<Book> allIssuedBooks() {
        return bookList.getAllBooks();
    }

    @Override
    public void setDetails(String name) {
        this.name = name;
    }
}
