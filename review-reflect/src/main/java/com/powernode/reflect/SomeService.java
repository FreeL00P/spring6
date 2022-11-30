package com.powernode.reflect;

/**
 * SomeService
 *
 * @author fj
 * @date 2022/11/29 15:45
 */
public class SomeService {
    public String doSome(String serviceName){
        System.out.println("serviceName = " + serviceName);
        return serviceName;
    }
    public String doSome(String serviceName,int port){
        System.out.println("serviceName = " + serviceName+port);
        return serviceName+port;
    }
    public String doSome(String serviceName,int port,String ip){
        System.out.println("serviceName = " + serviceName+port+ip);
        return serviceName+port+ip;
    }
}
