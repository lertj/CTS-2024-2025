package ro.ase.csie.decorator.models;

import ro.ase.csie.decorator.abstracts.ADecorator;
import ro.ase.csie.decorator.interfaces.IAttackable;

public class DecoratorSword extends ADecorator {

    public DecoratorSword(IAttackable hero) {
        this.reference = hero;
    }

    @Override
    public void attack(int hp){
        System.out.println("Sword attack!");
        this.reference.attack(hp);
    }
}
