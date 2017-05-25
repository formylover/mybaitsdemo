package com.demo.ch4_ResultMapper.ResultMapper;

import com.demo.ch4_ResultMapper.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created by song on 2017/5/19.
 */
public class Run {
    SqlSessionFactory sqlSessionFactory;
    @Before
    public void setUp() throws IOException {
        String resource = "./SqlMapConf.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }
    @Test
    public void findOrdersUserResultMap() throws Exception {
        SqlSession sqlSession=sqlSessionFactory.openSession();

        OrdersMapperCustom ordersMapCustom=sqlSession.getMapper(OrdersMapperCustom.class) ;
        List<Orders> ordersList=ordersMapCustom.findOrdersUserResultMap();

        System.out.println(ordersList.get(0)+"--");
        System.out.println(ordersList.get(1)+"--");

    }
    @Test
    public void findOrdersAndOrderDetailResultMap() throws Exception {
        SqlSession sqlSession=sqlSessionFactory.openSession();

        OrdersMapperCustom ordersMapCustom=sqlSession.getMapper(OrdersMapperCustom.class) ;
        List<Orders> ordersList=ordersMapCustom.findOrdersAndOrderDetailResultMap();

        System.out.println(ordersList.get(0)+"---");
        System.out.println(ordersList.get(1)+"---");

    }

    @Test
    public void findUserAndItemsResultMap() throws Exception{
        SqlSession sqlSession=sqlSessionFactory.openSession();

        OrdersMapperCustom ordersMapCustom=sqlSession.getMapper(OrdersMapperCustom.class) ;
        List<User> userList=ordersMapCustom.findUserAndItemsResultMap();

        System.out.println(userList.get(0).getOrdersList().get(0).getOrderdetails()+"---");
        System.out.println(userList.get(0).getOrdersList().get(1).getOrderdetails()+"---");

    }

}
