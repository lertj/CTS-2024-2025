package ro.ase.csie.decorator.abstracts;

import ro.ase.csie.decorator.interfaces.IAttackable;

public abstract class ADecorator implements IAttackable {
    protected IAttackable reference;

}
