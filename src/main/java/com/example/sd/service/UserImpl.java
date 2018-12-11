package com.example.sd.service;

import com.example.sd.domain.User;
import com.example.sd.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserImpl {

    @Autowired
    private UserMapper userMapper;

    public User findById(Long id){
        return  userMapper.findById(id);
    }
}
