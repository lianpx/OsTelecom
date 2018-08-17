package com.demo.dao;

import com.demo.entity.User;
import org.springframework.stereotype.Component;

import java.util.List;


public interface UserDao {

    //select user
    public User getUserById(Integer userId);

    // user insert
    public void insertUser(User record);

    // user update
    public void updateUser(User user);

    // user delete
    public void deleteUser(User user);

    // show all users;
    public List<User> showAll();

    public User verifiyLogin(User user);

    public User verifiyLogin1(User user);

    public User showUserByName(String userName);

    public User showUserInfo(User user);
}