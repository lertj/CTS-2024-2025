package ro.ase.cts.models.template;

public abstract class AMafia {
    public final void joaca1Tura(){
        turaAssassin();
        turaMedic();
        turaPrimar();
        turaPolitist();
    }

    abstract void turaMedic();
    abstract void turaPrimar();
    abstract void turaAssassin();
    abstract void turaPolitist();
}
