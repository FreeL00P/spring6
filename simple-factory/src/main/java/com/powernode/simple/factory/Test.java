package com.powernode.simple.factory;

/**
 * Test
 *
 * @author fj
 * @date 2022/11/28 14:29
 */
public class Test {
    public static void main(String[] args) {
        //需要坦克
        Weapon tank = WeaponFactory.get("Tank");
        //需要匕首
        Weapon dagger = WeaponFactory.get("Dagger");
        //需要战斗机
        Weapon fighter = WeaponFactory.get("Fighter");

        System.out.println(tank);
        System.out.println(dagger);
        System.out.println(fighter);
    }
}
