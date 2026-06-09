package com.sagar.demo;

import org.springframework.beans.factory.annotation.Qualifier;

public class NormalCar implements Car{
    String owner;

    Tyre tyre;

    public NormalCar(Tyre tyre) {
        this.tyre = tyre;
    }

    @Override
    public String getInfo() {
        return owner+" owns a Family Car "+tyre.getTyreInfo();
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
