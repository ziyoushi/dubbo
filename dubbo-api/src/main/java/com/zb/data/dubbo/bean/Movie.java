package com.zb.data.dubbo.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * @author changchen
 * @create 2019-11-24 22:55
 */
@Data
public class Movie implements Serializable {
    private Integer id;
    private String movieName;
    private Double price;
}
