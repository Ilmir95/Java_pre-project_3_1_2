package com.example.springbootcrud.service;


import com.example.springbootcrud.model.User;

import java.util.List;

public interface UserService {
    void saveUser(User user);

    void removeUserById(int id);

    List<User> getAllUsers();

    User getUserById(int id);
    void updateUser(User user);
}
