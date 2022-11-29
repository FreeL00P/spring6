package com.powernode.myspring.bean;

/**
 * UserDao
 *
 * @author fj
 * @date 2022/11/29 17:06
 */
public class UserDao {

    public  void insert(User user){
        System.out.println("将"+user+"保存到数据库");
    }
}
