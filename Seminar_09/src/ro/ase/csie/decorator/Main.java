package ro.ase.csie.decorator;

import ro.ase.csie.decorator.interfaces.IAttackable;
import ro.ase.csie.decorator.models.DecoratorShield;
import ro.ase.csie.decorator.models.DecoratorSword;
import ro.ase.csie.decorator.models.Hero;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<IAttackable> listHero = new ArrayList<>();

        Hero h = new Hero("Pardrei", 100);
        //h.attack(23);

        DecoratorSword hs = new DecoratorSword(h);
        //hs.attack(9);

        listHero.add(h);
        listHero.add(hs);



        DecoratorShield heroShield = new DecoratorShield(new Hero("Cataclismiu", 112));

        listHero.add(heroShield);

        listHero.forEach(x -> x.attack(11));

        heroShield.defend();

        IAttackable swordShieldHero = new DecoratorSword(heroShield);
        swordShieldHero.attack(5);

    }
}
