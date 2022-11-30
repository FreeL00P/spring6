package com.powernode.simple.factory;

/**
 * Fighter
 *
 * @author fj
 * @date 2022/11/28 14:20
 */
public class Fighter extends Weapon{
    @Override
    public void attack() {
        System.out.println("战斗机抛下了原子弹");
    }
}
