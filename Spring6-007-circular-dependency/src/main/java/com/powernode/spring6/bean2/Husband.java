package com.powernode.spring6.bean2;

/**
 * Husband
 *
 * @author fj
 * @date 2022/11/29 13:53
 */
public class Husband {

    private String name;

    private Wife wife;



    public String getName() {
        return name;
    }

    public Wife getWife() {
        return wife;
    }

    public Husband(String name, Wife wife) {
        this.name = name;
        this.wife = wife;
    }

    @Override
    public String toString() {
        return "Husband{" +
                "name='" + name + '\'' +
                ", wife=" + wife.getName() +
                '}';
    }
}
