package com.mdd.controller;

import com.mdd.domain.User;
import com.mdd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by mdd on 2018/3/3.
 */
@Controller
@RequestMapping("/user/")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("getUserInfo")
    @ResponseBody
    public User getUserInfo(@RequestParam("id") int id){
        return userService.getUserInfoById(id);
    }

    @RequestMapping("saveUserInfo")
    @ResponseBody
    public String saveUserInfo(User user){
        int i = userService.saveUserInfo(user);
        if (i == 0){
            return "save failure!";
        }
        return "save success!";
    }

}
