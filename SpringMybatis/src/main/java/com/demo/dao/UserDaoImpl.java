package com.demo.dao;

import com.demo.po.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

/**
 * Created by song on 2017/5/26.
 */
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao{
    public User findUserById(int id) {
        SqlSession sqlSession=this.getSqlSession();
        User user=sqlSession.selectOne("test.findUserById",id);
        return user;
    }
}
