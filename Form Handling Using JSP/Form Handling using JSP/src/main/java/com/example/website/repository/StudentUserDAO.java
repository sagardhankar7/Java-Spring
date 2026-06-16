package com.example.website.repository;

import com.example.website.domain.StudentUser;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository // on DAO Classed to create bean
@Scope("singleton")
public class StudentUserDAO implements DAO<StudentUser> {

//    Data Structure to save our data
    List<StudentUser> studentUserList = new ArrayList<>();

    @Override
    public Optional<StudentUser> get(int id) {
        if (!studentUserList.isEmpty()) return Optional.of(studentUserList.get(id));
        return Optional.empty();
    }

    @Override
    public int save(StudentUser studentUser) {
        int userId = studentUserList.size();
        studentUser.setId(userId);
        studentUserList.add(studentUser);
        System.out.println("Student Saved userId:"+userId);
        return userId;
    }
}
