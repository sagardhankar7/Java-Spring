package com.sagar.demo;

public class ShortTable implements Table{
    int len;
    int width;
    ShortTable() {
        len = 20;
        width = 10;
    }
    @Override
    public String showDetails() {
        return "Table with length: "+len+ " and width: "+width;
    }
}
