package com.zb.data.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author changchen
 * @create 2019-11-27 23:17
 */
public class MainApplication {

    @SuppressWarnings("resource")
    public static void main(String[] args) throws IOException {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("provider.xml");
        System.out.println("容器启动");
        context.start();
        System.in.read();

    }
}
