package com.demo.service.impl;

import com.demo.dao.UserDao;
import com.demo.entity.User;
import org.springframework.stereotype.Service;
import com.demo.service.UserService;
import javax.annotation.Resource;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public User getUserById(int userId) {
        return userDao.getUserById(userId);
    }


    @Override
    public void insertUser(User user) {
        userDao.insertUser(user);
    }

    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    @Override
    public void deleteUser(User user) {
        userDao.deleteUser(user);
    }

    @Override
    public List<User> showAll() {
        return userDao.showAll();
    }

    @Override
    public User verifiyLogin(User user) {
        return userDao.verifiyLogin(user);
    }

    @Override
    public User verifiyLogin1(User user) {
        return userDao.verifiyLogin1(user);
    }

    @Override
    public User showUserByName(String userName) {
        return userDao.showUserByName(userName);
    }

    @Override
    public User showUserInfo(User user) {
        return userDao.showUserInfo(user);
    }

}