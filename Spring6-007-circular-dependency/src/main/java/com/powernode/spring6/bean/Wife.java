package com.powernode.spring6.bean;

/**
 * Wife
 *
 * @author fj
 * @date 2022/11/29 13:53
 */
public class Wife {

    private String name;

    private Husband husband;

    public Wife setName(String name) {
        this.name = name;
        return this;
    }

    public Wife setHusband(Husband husband) {
        this.husband = husband;
        return this;
    }

    public String getName() {
        return name;
    }

    public Husband getHusband() {
        return husband;
    }

    @Override
    public String toString() {
        return "Wife{" +
                "name='" + name + '\'' +
                ", husband=" + husband.getName() +
                '}';
    }
}
