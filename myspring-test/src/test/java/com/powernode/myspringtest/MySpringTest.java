package com.powernode.myspringtest;

import com.powernode.myspring.bean.User;
import com.powernode.myspring.bean.UserService;
import org.junit.Test;
import org.myspringframework.core.ApplicationContext;
import org.myspringframework.core.ClassPathXmlApplicationContext;

/**
 * MySpringTest
 *
 * @author fj
 * @date 2022/11/29 17:55
 */
public class MySpringTest {
    @Test
    public void test() {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("myspring.xml");
        User user = (User) applicationContext.getBean("user");
        System.out.println(user);

        UserService userService =(UserService) applicationContext.getBean("userService");
        userService.insert(user);
    }
}
