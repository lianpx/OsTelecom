package com.demo.service;

import com.demo.entity.User;
import com.demo.dao.UserDao;
import java.util.List;
import java.util.Map;

public interface UserService {

    public User getUserById(int userId);

    public void insertUser(User user);

    public void updateUser(User user);

    public void deleteUser(User user);

    public List<User> showAll();

    public User verifiyLogin(User user);

    public User verifiyLogin1(User user);

    public User showUserByName(String userName);

    public User showUserInfo(User user);
}
