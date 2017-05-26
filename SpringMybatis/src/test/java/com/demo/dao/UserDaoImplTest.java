package com.demo.dao;

import com.demo.po.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by song on 2017/5/26.
 */
public class UserDaoImplTest {
    private ApplicationContext applicationContext=null;
    @Before
    public void setUp(){
        applicationContext=new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
    }
    @Test
    public void findUserById() throws Exception {
        UserDao userDao= (UserDao) applicationContext.getBean("userDao");
        User user=userDao.findUserById(1);
        System.out.println(user);

    }

}