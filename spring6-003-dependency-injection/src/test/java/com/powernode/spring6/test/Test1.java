package com.powernode.spring6.test;

import com.powernode.spring6.service.UserService;
import com.powernode.spring6.service.VipService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Test1
 *
 * @author fj
 * @date 2022/11/28 10:05
 */
public class Test1 {


    @Test
    public void test1() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
        UserService userService = applicationContext.getBean("userService", UserService.class);
        userService.insertUser();
    }

    @Test
    public void test2() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
        VipService vipService = applicationContext.getBean("vipService", VipService.class);
        vipService.insert();
    }

}
