package com.example.schoolhospital.serviceImpl;


import com.example.schoolhospital.model.User;
import com.example.schoolhospital.repository.UserRepository;
import com.example.schoolhospital.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    public List<User> getUsers() {
        List<User> users = new ArrayList<>();
        userRepository.findAll().forEach(users::add);
        return users;
    }

    public User getUserById(Integer id) {
        return userRepository.findById(id).get();
    }

    public User insert(User user) {
        return userRepository.save(user);
    }

    public void updateUser(Integer id, User t) {
        User userFromDb = userRepository.findById(id).get();
        System.out.println(userFromDb.toString());
        userFromDb.setFirstName(t.getFirstName());
        userFromDb.setLastName(t.getLastName());
        userFromDb.setEmail(t.getEmail());
        userFromDb.setPhone(t.getPhone());
        userFromDb.setImageUrl(t.getImageUrl());
        userRepository.save(userFromDb);
    }

    public void deleteUser(Integer id) {
        userRepository.deleteById(id);
    }
}