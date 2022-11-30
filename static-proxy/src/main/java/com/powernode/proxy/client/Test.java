package com.powernode.proxy.client;

import com.powernode.proxy.service.OrderService;
import com.powernode.proxy.service.OrderServiceImpl;
import com.powernode.proxy.service.OrderServiceImplSub;
import com.powernode.proxy.service.OrderServiceProxy;

/**
 * Test
 *
 * @author fj
 * @date 2022/11/30 21:09
 */
public class Test {
    public static void main(String[] args) {
        /**
         * 项目经理提出一个新的需求: 要统计所有业务接口中每“ 个业务方法的耗时。
         * ★解决方案一。硬编码，在每一一个业务接口中的每一 个业务方法中直直接添加统计计时的程序。
         * ★这种方案的缺点:
         *      缺点一站0CP开闭原则。
         *      缺点二代码没有彻到复用。( 相同的代码写了很多)
         * *解决方案中二 编写写业务类的子类，i让子类继承业务类，对每个业务方法进行重写。
         *      缺点-，虽然解决7OCP开F闭原则。但见这种方式会导政耦合度很高，因为采用了继承关系。继承关系见一“种牌合度 非常高的关系，不建议使用。
         *      缺点二代码没有彻到女用。(相间的代码写了很多的。 )
         * *解决方案三:代理模式。
         *      优/1:解决了OCP问题。
         *      优点2:采用代理模式 has a, 可以降低耦合度。
         *  缺点
         *  每个接口都要添加一个代理类 类爆炸 不好维护
         *  可以使用动态代理
         */
//        OrderService orderService = new OrderServiceImpl();
//        orderService.generate();
//        orderService.modify();
//        orderService.detail();

//        OrderServiceImplSub orderServiceImplSub = new OrderServiceImplSub();
//        orderServiceImplSub.generate();
//        orderServiceImplSub.modify();
//        orderServiceImplSub.detail();
        OrderService orderService = new OrderServiceImpl();
        OrderService serviceProxy = new OrderServiceProxy(orderService);
        serviceProxy.generate();
        serviceProxy.modify();
        serviceProxy.detail();
    }
}
