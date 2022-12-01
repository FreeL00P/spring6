package com.powernode.proxy.util;

import com.powernode.proxy.service.OrderService;
import com.powernode.proxy.service.TimeInvocationHandler;

import java.lang.reflect.Proxy;

/**
 * ProxyUtil
 *
 * @author fj
 * @date 2022/11/30 23:47
 */
public class ProxyUtil {
    public static Object newProxyInstance(Object target){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new TimeInvocationHandler(target));
    }
}
