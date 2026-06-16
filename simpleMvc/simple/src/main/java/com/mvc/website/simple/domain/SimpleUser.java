package com.mvc.website.simple.domain;

public class SimpleUser implements User{
    String name;
    int age;
    String location;
    String college;

    @Override
    public Integer saveUser() {
        return 0;
    }

    @Override
    public boolean createUser(String name, int age, String location, String college) {
        this.name = name;
        this.age = age;
        this.location = location;
        this.college = college;

        return true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }
}
