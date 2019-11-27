package com.zb.data.dubbo.impl;

import com.zb.data.dubbo.bean.Movie;
import com.zb.data.dubbo.bean.Order;
import com.zb.data.dubbo.bean.User;
import com.zb.data.dubbo.service.MovieService;
import com.zb.data.dubbo.service.UserService;

/**
 * @author changchen
 * @create 2019-11-24 22:49
 * 使用dubbo的步骤
 * 1、引入dubbo的依赖和操作zk的客户端
 * 2、 配置服务提供者将服务暴露出来-->注册到注册中心
 *
 *
 */
public class UserServiceImpl implements UserService {

    MovieService movieService;

    public MovieService getMovieService(){
        return movieService;
    }

    public void setMovieService(MovieService movieService){
        this.movieService = movieService;
    }

    @Override
    public Order buyNewMovie(User user) {

        // 远程查询最新电影并返回
        Movie movie = movieService.getNewMovie();
        System.out.println("远程调用movie服务获取到的结果："+movie.getMovieName());
        //封装order对象返回
        Order order = new Order();
        order.setUserName(user.getUserName());
        order.setMovieId(movie.getId());
        order.setMoveName(movie.getMovieName());
        return order;
    }
}
