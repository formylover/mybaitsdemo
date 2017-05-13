package com.demo.ch2_Dao;

import com.demo.ch1_plain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by song on 2017/5/13.
 */
public class UerDaoRun {
    SqlSessionFactory sqlSessionFactory;
    @Before
    public void setUp() throws IOException {
        String resource = "./SqlMapConf.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }
    @Test
    public void findUser(){
       UserDaoImp userDaoImp=new UserDaoImp(sqlSessionFactory);
       User user=userDaoImp.findUserById(1);
        System.out.println(user.getName());
    }

}
