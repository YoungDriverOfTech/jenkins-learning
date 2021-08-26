package com.example.jekinsLearning.service;

import com.example.jekinsLearning.mapper.UserMapper;
import com.example.jekinsLearning.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User findUserById(Integer id) {
        return userMapper.findUserById(id);
    }
}
