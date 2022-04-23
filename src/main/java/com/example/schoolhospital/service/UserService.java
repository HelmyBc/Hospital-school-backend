package com.example.schoolhospital.service;

import com.example.schoolhospital.model.User;

import java.util.List;

public interface UserService {

    List<User> getUsers();

    User getUserById(Integer id);

    User insert(User u);

    void updateUser(Integer id, User u);

    void deleteUser(Integer id);
}
