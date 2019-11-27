package com.zb.data.dubbo;

import com.zb.data.dubbo.bean.Order;
import com.zb.data.dubbo.bean.User;
import com.zb.data.dubbo.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author changchen
 * @create 2019-11-27 23:32
 */
public class MainApplication {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws IOException {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        System.out.println("测试远程调用。。。");
        UserService userService = context.getBean(UserService.class);
        User user = new User();
        user.setId(1);
        user.setUserName("zhangsan");
        //测试这次远程调用是否成功
        Order order = userService.buyNewMovie(user);


        System.in.read();
    }
}
