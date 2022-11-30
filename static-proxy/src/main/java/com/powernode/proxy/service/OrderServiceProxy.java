package com.powernode.proxy.service;

/**
 * OrderServiceProxy
 *
 * @author fj
 * @date 2022/11/30 21:27
 */
//代理对象与目标对象都要具有相同的行为，就要实现同一个会同一些接口
    //客户端在使用代理对象就像在使用目标对象
public class OrderServiceProxy implements OrderService{
    /**
     *  将目标对象作为代理对象的一个属性，这种关系叫做关联关系，
     *  这种关系比继承关系耦合度低
     *  代理对象中含有目标对象的引用，关联关系 has a
     */
    private OrderService target;
    public OrderServiceProxy(OrderService target) {
        this.target = target;
    }
    @Override
    public void generate() {
        long start = System.currentTimeMillis();
        //调用目标对象方法
        target.generate();
        long end = System.currentTimeMillis();
        System.out.println("耗时"+(end-start));
    }

    @Override
    public void modify() {
        long start = System.currentTimeMillis();
        target.modify();
        long end=System.currentTimeMillis();
        System.out.println("耗时"+(end-start));
    }

    @Override
    public void detail() {
        long start = System.currentTimeMillis();
        target.detail();
        long end=System.currentTimeMillis();
        System.out.println("耗时"+(end-start));
    }
}
