package com.powernode.myspring.bean;

/**
 * UserService
 *
 * @author fj
 * @date 2022/11/29 17:05
 */
public class UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void insert(User user){
        userDao.insert(user);
    }
}
