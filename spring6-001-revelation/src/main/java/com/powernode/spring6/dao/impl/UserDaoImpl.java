package com.powernode.spring6.dao.impl;

import com.powernode.spring6.dao.UserDao;

/**
 * UserDaoImpl
 *
 * @author fj
 * @date 2022/11/27 15:34
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void deleteUser() {
        System.out.println("删除一个User");
    }
}
