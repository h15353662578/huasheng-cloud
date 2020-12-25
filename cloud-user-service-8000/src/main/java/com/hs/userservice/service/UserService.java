package com.hs.userservice.service;

import com.hs.entity.User;

import java.util.List;

/**
 * @author 华生
 * 2020/12/26
 */
public interface UserService {

    /***
     * 查询全部用户
     * @return
     */
    public List<User> findAllUser();
}
