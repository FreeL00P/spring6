package com.powernode.simple.factory;

/**
 * Tank
 *
 * @author fj
 * @date 2022/11/28 14:16
 */
public class Tank extends Weapon{

    @Override
    public void attack(){
        System.out.println("坦克开炮!!!!");
    }

}
