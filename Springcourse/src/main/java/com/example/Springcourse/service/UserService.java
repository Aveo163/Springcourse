package com.example.Springcourse.service;

import com.example.Springcourse.model.User;


import java.util.List;

public interface UserService {
    void addUser(User user);

    List<User> listUsers();

    void changeUser(User user);

    void removeUser(Long id);

    User findById(Long id);
}
