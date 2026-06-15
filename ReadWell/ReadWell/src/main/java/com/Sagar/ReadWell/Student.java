package com.Sagar.ReadWell;

import java.util.List;

public interface Student {
    void issueBook(Book book);
    List<Book> allIssuedBooks();
    void setDetails(String name);

}
