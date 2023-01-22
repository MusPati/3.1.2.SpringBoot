package com.example.demo.service;

import com.example.demo.model.User;


import java.util.List;

public interface UserService {

    void saveUser (User user);

    void deleteUser (int id);


    List <User> getAllUsers ();

    User showUserById(int id);

    void updateUserInfo(int id, User user);

    public void updateUser(User user);

}
