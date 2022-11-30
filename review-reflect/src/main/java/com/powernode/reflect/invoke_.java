package com.powernode.reflect;

import java.lang.reflect.Method;

/**
 * invoke_
 *
 * @author fj
 * @date 2022/11/29 15:47
 */
public class invoke_ {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("com.powernode.reflect.SomeService");
        Method doSomething = clazz.getDeclaredMethod("doSome", String.class);

        Object obj = clazz.newInstance();
        Object ret = doSomething.invoke(obj, "张珊");
        System.out.println(ret);
    }
}
