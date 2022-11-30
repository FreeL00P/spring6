package com.powernode.spring6;

import com.powernode.spring6.bean.Husband;
import com.powernode.spring6.bean.Wife;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * testCircular
 *
 * @author fj
 * @date 2022/11/29 13:59
 */
public class testCircular {

    @Test
    public void test() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Wife wife = applicationContext.getBean("wife", Wife.class);
        Husband husband = applicationContext.getBean("husband", Husband.class);
        System.out.println("husband = " + husband);
        System.out.println("wife = " + wife);

    }

    @Test
    public void test2() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Wife wife = applicationContext.getBean("wife1", Wife.class);
        Husband husband = applicationContext.getBean("husband1", Husband.class);
        System.out.println("husband = " + husband);
        System.out.println("wife = " + wife);

    }

    }
