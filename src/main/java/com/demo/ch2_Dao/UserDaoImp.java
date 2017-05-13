package com.demo.ch2_Dao;

import com.demo.ch1_plain.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

/**
 * Created by song on 2017/5/13.
 */
public class UserDaoImp implements UserDao {
    private SqlSessionFactory sqlSessionFactory;

    public UserDaoImp(SqlSessionFactory sqlSessionFactory){
        this.sqlSessionFactory=sqlSessionFactory;
    }

    public User findUserById(int id) {
        SqlSession sqlSession=sqlSessionFactory.openSession();
        User user=sqlSession.selectOne("daotest.findUserById",id);
        sqlSession.close();
        return user;
    }
}
