package com.powernode.proxy.service;

/**
 * OrderServiceImpl
 *
 * @author fj
 * @date 2022/11/30 21:04
 */
public class OrderServiceImpl implements OrderService{
    @Override
    public void generate() {
        try{
            Thread.sleep(1000);
        }catch(Exception e){
            e.printStackTrace();
        }

        System.out.println("订单已生成");
    }

    @Override
    public void modify() {
        try{
            Thread.sleep(1000);
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("订单已修改");
    }

    @Override
    public void detail() {
        try{
            Thread.sleep(1000);
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("查看订单详情");
    }

    @Override
    public String getName() {
        System.out.println("getName run");
        return "张三";
    }
}
