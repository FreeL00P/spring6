package com.powernode.spring6.bean;

/**
 * StarFactory
 *
 * @author fj
 * @date 2022/11/28 19:02
 */
public class StarFactory {
    public StarFactory() {
        System.out.println("StarFactory 无参构造执行");
    }

    public static Star getStar() {
        return new Star();
    }
}
