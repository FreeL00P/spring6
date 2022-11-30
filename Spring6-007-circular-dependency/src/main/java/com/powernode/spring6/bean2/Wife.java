package com.powernode.spring6.bean2;

/**
 * Wife
 *
 * @author fj
 * @date 2022/11/29 13:53
 */
public class Wife {

    private String name;

    private Husband husband;

    public Wife(String name, Husband husband) {
        this.name = name;
        this.husband = husband;
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
