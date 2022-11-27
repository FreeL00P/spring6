package com.powernode.spring6.service.Impl;

import com.powernode.spring6.dao.UserDao;
import com.powernode.spring6.dao.impl.UserDaoImpl;
import com.powernode.spring6.service.UserService;

/**
 * UserServiceImpl
 *
 * @author fj
 * @date 2022/11/27 15:36
 */
public class UserServiceImpl implements UserService {


    private UserDao userDao;


    @Override
    public void removeUser() {
        userDao.deleteUser();
    }
}
