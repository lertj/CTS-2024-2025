package ro.ase.csie.decorator.models;

import ro.ase.csie.decorator.interfaces.IAttackable;

public class Hero implements IAttackable {
    String name;
    int hitPoint;

    public Hero(String name, int hitPoint) {
        this.name = name;
        this.hitPoint = hitPoint;
    }

    @Override
    public void attack(int hp) {
        this.hitPoint -= hp;
        System.out.println(this.name + " attacks for " + this.hitPoint + " HP.");

    }
}
