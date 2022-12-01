package com.powernode.proxy.service;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * TimeInvocationHandler
 *
 * @author fj
 * @date 2022/11/30 23:06
 */
public class TimeInvocationHandler implements InvocationHandler {
    //目标对象
    private Object target;
    public TimeInvocationHandler(Object target) {
        this.target = target;
    }

    /**
     * 为什么强行要求你必须要实现接口中的方法
     * 因为一个类实现接口就必须实现接口中的方法
     * 因为这个方法必须是invoke()，因为JDK在底层调用invoke()的程序以及提前写好了，
     * 注意：invoke方法不是我们程序员负责调用的，是JDK负责调用的
     * 2. invoke方法什么时候被调用的
     *  当代理对象调用代理方法的时候，注册在InvocationHandler的invoke方法被调用
     *
     *  invoke是JDK负责调用的 所以JDK会自动传过来这三个参数，我们可以直接使用
     * 参数 1 proxy 代理对象
     * 参数 2 method 目标对象上的目标方法
     * 参数 3 args 目标方法上的参数
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Invoke ................");
        long begin = System.currentTimeMillis();
        //调用目标对象的目标方法
        Object retValue = method.invoke(target, args);
        long end=System.currentTimeMillis();
        System.out.println("Invoke time:"+(end-begin));
        return retValue;
    }

}
