package com.mvc.website.simple.domain;

public interface User {
    Integer saveUser();
    boolean createUser(String name, int age, String location, String college);
}
