package com.sagar.demo;

public class Truck implements Car{
    String owner;
    Tyre tyre;

    public Truck(Tyre tyre) {
        this.tyre = tyre;
    }

    @Override
    public String getInfo() {
        return owner+" owns a truck "+tyre.getTyreInfo();
    }

    @Override
    public void setOwnerName(String owner) {
        this.owner = owner;
    }

    @Override
    public String getOwnerName() {
        return owner;
    }
}
