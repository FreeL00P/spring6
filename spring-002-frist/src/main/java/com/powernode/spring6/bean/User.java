package com.powernode.spring6.bean;

/**
 * User
 *
 * @author fj
 * @date 2022/11/27 21:57
 */

public class User {
    private String name;
    private int age;

    public String name() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public int age() {
        return age;
    }

    public User setAge(int age) {
        this.age = age;
        return this;
    }

    public User() {
        System.out.println("执行无参构造方法");
    }
//    @Override
//    public String toString() {
//        return "User{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }
}
