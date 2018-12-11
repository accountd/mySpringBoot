package com.example.sd.controller;

import com.example.sd.domain.User;
import com.example.sd.service.UserImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserImpl userImpl;


    @GetMapping(value = "findById")
    public User findById(long id) {
       return userImpl.findById(id);
    }
}
