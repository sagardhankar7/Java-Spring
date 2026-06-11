package com.sagar.demo;

public class SportsCar implements Car{
    String owner;
    Tyre tyre;

//    public SportsCar(Tyre tyre) {
//        this.tyre = tyre;
//    }

    @Override
    public String getInfo() {
        return owner+" owns a Sports Car "+tyre.getTyreInfo();
    }

    @Override
    public void setOwnerName(String owner) {
        this.owner = owner;
    }

    @Override
    public String getOwnerName() {
        return owner;
    }

    public void setTyre(Tyre tyre) {
        this.tyre = tyre;
    }
}
