package com.Sagar.ReadWell;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class SimpleBook implements Book {
    String name;
    Boolean isIssued = false;
    int id;
    String owner;

    public static int counter = 0;

    public SimpleBook(){
        this.id=counter++;
    }

    public SimpleBook(String name) {
        this.name = name;
        this.id = counter++;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name + " id:"+ id;
    }

    @Override
    public boolean isIssued() {
        return isIssued;
    }

    @Override
    public void setIssue(String owner) {
        this.owner = owner;
        this.isIssued= true;
        System.out.println("Book is issued to "+this.owner);
    }

    @Override
    public int getId() {
        return this.id;
    }
}
