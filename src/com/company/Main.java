package com.company;

public class Main {

    public static void main(String[] args) {
	Boss boss = new Boss();
    boss.setHealth(200);
    boss.setDamage(50);
    boss.weapon.setWeaponName("machine");
    boss.weapon.setWeaponType("pistol");
        System.out.println(boss.printInfo());

        Skeleton skeletonFirst = new Skeleton();
        skeletonFirst.setHealth(400);
        skeletonFirst.setDamage(100);
        skeletonFirst.weapon.setWeaponType("arrow");
        skeletonFirst.weapon.setWeaponName("bow");
        System.out.println(skeletonFirst.printInfo());

        Skeleton skeletonSecond = new Skeleton();
        skeletonSecond.setHealth(450);
        skeletonSecond.setDamage(110);
        skeletonSecond.weapon.setWeaponType("arrow");
        skeletonSecond.weapon.setWeaponName("bow");
        System.out.println(skeletonSecond.printInfo());
    }

}
