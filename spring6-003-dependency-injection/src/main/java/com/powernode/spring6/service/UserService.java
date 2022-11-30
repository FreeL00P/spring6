package com.powernode.spring6.service;

import com.powernode.spring6.dao.UserDao;
import lombok.extern.slf4j.Slf4j;

/**
 * UserService
 *
 * @author fj
 * @date 2022/11/28 10:00
 */
public class UserService {

    private UserDao userDao;

    public void insertUser(){
        userDao.insert();
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
