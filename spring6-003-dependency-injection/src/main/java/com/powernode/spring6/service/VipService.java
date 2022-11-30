package com.powernode.spring6.service;

import com.powernode.spring6.dao.UserDao;
import com.powernode.spring6.dao.VipDao;

/**
 * VipService
 *
 * @author fj
 * @date 2022/11/28 10:48
 */
public class VipService {

    private VipDao vipDao;
    private UserDao userDao;

    public VipService(VipDao vipDao, UserDao userDao) {
        this.vipDao = vipDao;
        this.userDao = userDao;
    }

    public void insert(){
       userDao.insert();
       vipDao.insert();

    }
}
