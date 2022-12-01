package com.powernode.proxy.client;

import com.powernode.proxy.service.OrderService;
import com.powernode.proxy.service.OrderServiceImpl;
import com.powernode.proxy.service.TimeInvocationHandler;
import com.powernode.proxy.util.ProxyUtil;

import java.lang.reflect.Proxy;

/**
 * Client
 *
 * @author fj
 * @date 2022/11/30 22:15
 */
public class Client {
    public static void main(String[] args) {
        //创建目标对象
        OrderService target = new OrderServiceImpl();
        //创建代理对象
        /**
         * newProxyInstance-->中文：新建代理对象
         * 参数 1 类加载器    ClassLoader loader,
         *      在内存当中生成的字节码也是class文件，要执行也得先加载到内存当中，
         *      加载类就需要类加载器，所以需要指定类加载器，
         *      并且JDK要求目标类的类加载器要和代理类的类加载器为同一个
         * 参数 2 代理类要实现的接口   Class<?>[] interfaces
         *      代理类要和目标类实现同一个或同一些接口
         * 参数3 调用处理器    InvocationHandler h
         *       在调用处理器接口中编写的就是：增强代码
         * 返回代理对象
         * 做了什么：
         *      1.在内存中动态生成了一个代理类的字节class
         *      2.new 对象了，通过内存中生成的代理类代码，实例化的代理对象
         *
         */
        //因为代理对象和代理方法实现了同一个接口 所以可以向下转型
//
        OrderService proxy= (OrderService)ProxyUtil.newProxyInstance(target);
        //调用代理对象的代理方法
        proxy.detail();
        proxy.modify();
        proxy.generate();
        String name=proxy.getName();
        System.out.println("name = " + name);
    }
}
