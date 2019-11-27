package com.zb.data.dubbo.service;


import com.zb.data.dubbo.bean.Movie;

/**
 * @author changchen
 * @create 2019-11-24 22:57
 */
public interface MovieService {
    //获取最新电影
    public Movie getNewMovie();
}
