package com.example.website.repository;

import java.util.Optional;

//Know: Persistence layer
public interface DAO <T>{
    public Optional<T> get(int id);
    public int save(T t);
}
