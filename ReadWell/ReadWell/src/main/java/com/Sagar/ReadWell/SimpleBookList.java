package com.Sagar.ReadWell;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SimpleBookList implements BookList{
    List<Book> bookList = new ArrayList<>();


//    Todo: Use SimpleBook Class
    @Override
    public List<Book> getAllBooks() {
        return this.bookList;
    }

    @Override
    public void addBook(Book book) {
        this.bookList.add(book);
    }

    @PostConstruct
    void init() {
//        Book book = null;
//        book.setName("Jervis ");
        this.bookList.add(new SimpleBook("The Default Book"));
    }
}
