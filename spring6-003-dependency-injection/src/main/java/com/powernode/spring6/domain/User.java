package com.powernode.spring6.domain;

/**
 * User
 *
 * @author fj
 * @date 2022/11/28 10:06
 */
public class User {
    public String name() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public String password() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public User() {
    }

    private String name;

    private String password;

}
