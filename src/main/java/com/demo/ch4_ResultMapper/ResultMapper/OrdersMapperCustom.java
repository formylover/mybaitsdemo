package com.demo.ch4_ResultMapper.ResultMapper;

import com.demo.ch4_ResultMapper.User;

import java.util.List;

/**
 * Created by song on 2017/5/19.
 */
public interface OrdersMapperCustom {

    public List<Orders> findOrdersUserResultMap() throws  Exception;
    public List<Orders> findOrdersAndOrderDetailResultMap() throws  Exception;
    public List<User>   findUserAndItemsResultMap() throws Exception;


}
