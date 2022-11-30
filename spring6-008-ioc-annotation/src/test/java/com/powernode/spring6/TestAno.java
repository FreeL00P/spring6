package com.powernode.spring6;

import com.powernode.spring6.bean.User;
import com.powernode.spring6.bean.UserController;
import com.powernode.spring6.bean.UserDao;
import com.powernode.spring6.bean.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * test
 *
 * @author fj
 * @date 2022/11/29 23:06
 */
public class TestAno {
    @Test
    public void test1(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        User user = applicationContext.getBean("user", User.class);
        UserService userService = applicationContext.getBean("userService", UserService.class);
        UserController userController = applicationContext.getBean("userController", UserController.class);
        UserDao userDao = applicationContext.getBean("userDao", UserDao.class);
        System.out.println("userDao = " + userDao);
        System.out.println("userController = " + userController);
        System.out.println("userService = " + userService);
        System.out.println("user = " + user);

    }
}
