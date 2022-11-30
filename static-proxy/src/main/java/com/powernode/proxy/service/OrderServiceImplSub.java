package com.powernode.proxy.service;

/**
 * OrderServiceImplSub
 *
 * @author fj
 * @date 2022/11/30 21:20
 */
public class OrderServiceImplSub extends OrderServiceImpl{
    @Override
    public void generate() {
        long start = System.currentTimeMillis();
        super.generate();
        long end=System.currentTimeMillis();
        System.out.println("耗时"+(end-start));
    }

    @Override
    public void modify() {
        long start = System.currentTimeMillis();
        super.modify();
        long end=System.currentTimeMillis();
        System.out.println("耗时"+(end-start));
    }

    @Override
    public void detail() {
        long start = System.currentTimeMillis();
        super.detail();
        long end=System.currentTimeMillis();
        System.out.println("耗时"+(end-start));
    }
}
