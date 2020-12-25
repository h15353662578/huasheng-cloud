package com.hs.userservice.service.impl;

import com.hs.entity.User;
import com.hs.userservice.mapper.UserMapper;
import com.hs.userservice.service.UserService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author 华生
 * 2020/12/26
 */

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAllUser(){
        return userMapper.findAllUser();
    }

}
