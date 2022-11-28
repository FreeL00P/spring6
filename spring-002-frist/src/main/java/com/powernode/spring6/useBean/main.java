package com.powernode.spring6.useBean;

import com.powernode.spring6.bean.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

/**
 * main
 *
 * @author fj
 * @date 2022/11/27 22:00
 */
@Slf4j
public class main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        User user = applicationContext.getBean("user", User.class);
        User user1 = applicationContext.getBean("user", User.class);
        System.out.println("user = " + user);
        System.out.println("user1 = " + user1);
        Date nowDate = applicationContext.getBean("nowDate", Date.class);
        System.out.println("nowDate = " + nowDate);
        System.out.println("new Date() = " + new Date());
    }
}
