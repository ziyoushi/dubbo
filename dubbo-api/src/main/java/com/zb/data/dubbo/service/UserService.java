package com.zb.data.dubbo.service;


import com.zb.data.dubbo.bean.Order;
import com.zb.data.dubbo.bean.User;

/**
 * @author changchen
 * @create 2019-11-24 22:48
 */
public interface UserService {

    public Order buyNewMovie(User user);
}
