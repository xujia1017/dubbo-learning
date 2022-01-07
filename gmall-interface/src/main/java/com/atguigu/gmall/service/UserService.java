package com.atguigu.gmall.service;

import java.util.List;

import com.atguigu.gmall.bean.UserAddress;

/**
 * 用户服务
 *
 * @author Athletic
 * Created on 2022-01-05 17:54:54
 */
public interface UserService {

    /**
     * 按照用户id返回所有的收货地址
     */
    List<UserAddress> getUserAddressList(String userId);

}
