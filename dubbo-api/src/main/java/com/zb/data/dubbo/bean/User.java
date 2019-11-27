package com.zb.data.dubbo.bean;


import lombok.Data;

import java.io.Serializable;

/**
 * @author changchen
 * @create 2019-11-24 22:48
 */
@Data
public class User implements Serializable {
    private Integer id;
    private String userName;
}
