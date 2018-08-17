package com.demo.controller;

import com.demo.entity.User;
import com.demo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@CrossOrigin
@RequestMapping("/user")
public class LoginController {

  @Resource
  private UserService userService;

  @RequestMapping("/login")
  @ResponseBody
  public User verifiyLogin(User user) {
    int result = 0;
    //userService.verifiyLogin(user);
    User resultUser = userService.verifiyLogin(user);
    System.out.println("user = " + user.getUserId() + " " + "pwd = " + user.getUserPwd() );
    return resultUser;
  }

  @RequestMapping("/login1")
  @ResponseBody
  public User verifiyLogin1(User user) {
    int result = 0;
    User resultUser = userService.verifiyLogin1(user);
    System.out.println("user = " + user.getUserId() + " " + "pwd = " + user.getUserPwd() );
    return resultUser;
  }
}
