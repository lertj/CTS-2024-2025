package ro.ase.csie.decorator.models;

import ro.ase.csie.decorator.abstracts.ADecorator;
import ro.ase.csie.decorator.interfaces.IAttackable;

public class DecoratorShield extends ADecorator {

    public DecoratorShield(IAttackable hero) {
        this.reference = hero;
    }

    @Override
    public void attack(int hp){
        System.out.println("Shield attack!");
        this.reference.attack(hp);
    }

    public void defend(){
        if(this.reference instanceof Hero)
            System.out.println(((Hero)this.reference).name + " is defending!");
        else{
            System.out.println("Defending!!!");
        }
    }
}
