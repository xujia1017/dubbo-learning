package com.atguigu.gmall.service;

import java.util.List;

import com.atguigu.gmall.bean.UserAddress;

public interface OrderService {

    /**
     * 初始化订单
     */
    List<UserAddress> initOrder(String userId);

}
