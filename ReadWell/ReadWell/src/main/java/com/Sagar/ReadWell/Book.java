package com.Sagar.ReadWell;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

public interface Book {
    void setName(String name);
    String getName();
    boolean isIssued(); // return if issued or false
    void setIssue(String owner); // setting the book as issue
    int getId();
}
