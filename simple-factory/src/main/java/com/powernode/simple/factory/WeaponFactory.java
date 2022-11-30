package com.powernode.simple.factory;

/**
 * WeaponFactory
 *
 * @author fj
 * @date 2022/11/28 14:23
 */
public class WeaponFactory {

    public static Weapon get(String weaponType){
        if ("Tank".equals(weaponType)){
            return new Tank();
        }else if ("Dagger".equals(weaponType)){
            return new Dagger();
        }else if ("Fighter".equals(weaponType)) {
            return new Fighter();
        }else {
            throw new RuntimeException("Unknown weapon type");
        }


    }
}
