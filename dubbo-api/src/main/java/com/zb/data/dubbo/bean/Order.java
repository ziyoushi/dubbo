package com.zb.data.dubbo.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * @author changchen
 * @create 2019-11-24 22:49
 */
@Data
public class Order implements Serializable {
    private Integer movieId;
    private String moveName;
    private String userName;
}
