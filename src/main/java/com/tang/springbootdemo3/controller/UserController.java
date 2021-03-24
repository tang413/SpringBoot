package com.tang.springbootdemo3.controller;

import com.tang.springbootdemo3.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/hello")
    public User test(){
        return new User(1, "张", true);
    }
}
