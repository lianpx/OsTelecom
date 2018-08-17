package com.demo.controller;

import com.demo.entity.User;
import com.demo.service.UserService;
import org.hibernate.internal.util.StringHelper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@CrossOrigin
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/showUser")
    @ResponseBody
    public User toIndex(HttpServletRequest request, Model model){
        int userId = Integer.parseInt(request.getParameter("userId"));
        User user = this.userService.getUserById(userId);
        return user;
    }

    @RequestMapping("/showUserByName")
    @ResponseBody
    public User showUserByName(HttpServletRequest request, Model model){
        String userName = String.format(request.getParameter("userName"));
        User user = this.userService.showUserByName(userName);
        return user;
    }

    @RequestMapping("/showUserInfo")
    @ResponseBody
    public User showUserInfo(HttpServletRequest request, Model model){
        int userId=0;
        String userName="";
        if (request.getParameter("userId") != null && Integer.parseInt(request.getParameter("userId")) > 0 ) {
            userId = Integer.parseInt(request.getParameter("userId"));
        }
        if (StringHelper.isNotEmpty(request.getParameter("userName"))) {
            userName = String.format(request.getParameter("userName"));
            System.out.println("userName = " + userName);
        }
        User user = new User();
        user.setUserId(userId);
        user.setUserName(userName);
        User resultUser = userService.showUserInfo(user);
        return resultUser;
    }



    @RequestMapping("/showAll")
    @ResponseBody
    public List<User> showAll() {
        System.out.println("查询所有");
        List<User> userList = userService.showAll();
        for(User user:userList) {
            System.out.println("用户："+user);
        }
        return userList;
    }

    @RequestMapping(value = "/insert")
    @ResponseBody
    public User insertUser(User user) {
        userService.insertUser(user);
        User result = this.userService.getUserById(user.getUserId());
        return result;
    }

    @RequestMapping(value = "/update")
    @ResponseBody
    public User updateUser(User user) {
        userService.updateUser(user);
        User result = this.userService.getUserById(user.getUserId());
        return result;
    }

    @RequestMapping(value = "/delete")
    @ResponseBody
    public User deleteUser(User user) {
        userService.deleteUser(user);
        User result = this.userService.getUserById(user.getUserId());
        return result;
    }

}