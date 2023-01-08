package com.example.springbootcrud.dao;
;

import com.example.springbootcrud.model.User;

import java.util.List;

public interface UserDao {

    void saveUser(User user);

    void removeUserById(int id);

    List<User> getAllUsers();

    User getUser(int id);
    void updateUser(User user);
}
