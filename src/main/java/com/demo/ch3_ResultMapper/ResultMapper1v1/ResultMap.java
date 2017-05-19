package com.demo.ch3_ResultMapper.ResultMapper1v1;

import java.util.List;

/**
 * Created by song on 2017/5/19.
 */
public interface ResultMap {
    //查询订单关联的用户
    //使用resultMap
    public List<Orders> findOrdersUserResultMap() throws  Exception;
}
