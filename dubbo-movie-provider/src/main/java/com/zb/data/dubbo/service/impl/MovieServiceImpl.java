package com.zb.data.dubbo.service.impl;

import com.zb.data.dubbo.bean.Movie;
import com.zb.data.dubbo.service.MovieService;

/**
 * @author changchen
 * @create 2019-11-24 22:57
 */
public class MovieServiceImpl implements MovieService {

    @Override
    public Movie getNewMovie() {

        Movie movie = new Movie();
        movie.setId(1);
        movie.setMovieName("复仇者联盟4");
        movie.setPrice(33.33);
        System.out.println("电影服务查询到最新的信息："+movie.getMovieName());
        return movie;
    }
}
