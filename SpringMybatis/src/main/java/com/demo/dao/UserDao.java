package com.demo.dao;

import com.demo.po.User;

/**
 * Created by song on 2017/5/26.
 */
public interface UserDao {
    public User findUserById(int id);
}
