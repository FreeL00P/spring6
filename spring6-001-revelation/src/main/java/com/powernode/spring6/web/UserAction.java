package com.powernode.spring6.web;

import com.powernode.spring6.service.Impl.UserServiceImpl;
import com.powernode.spring6.service.UserService;

/**
 * UserAction
 *
 * @author fj
 * @date 2022/11/27 15:37
 */
public class UserAction {

    private UserService userService;

    public void removeUser(){

        userService.removeUser();
    }

}
