package com.powernode.spring6.bean;

/**
 * Husband
 *
 * @author fj
 * @date 2022/11/29 13:53
 */
public class Husband {

    private String name;

    private Wife wife;

    public Husband setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }

    public Wife getWife() {
        return wife;
    }

    public Husband setWife(Wife wife) {
        this.wife = wife;
        return this;
    }

    @Override
    public String toString() {
        return "Husband{" +
                "name='" + name + '\'' +
                ", wife=" + wife.getName() +
                '}';
    }
}
