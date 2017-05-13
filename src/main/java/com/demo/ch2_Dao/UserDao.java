package com.demo.ch2_Dao;

import com.demo.ch1_plain.User;

/**
 * Created by song on 2017/5/13.
 */
public interface UserDao {
    public User findUserById(int id);
}
