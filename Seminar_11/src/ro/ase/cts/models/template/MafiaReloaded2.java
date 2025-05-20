package ro.ase.cts.models.template;

public class MafiaReloaded2 extends AMafia{

//    @Override
//    public void joaca1Tura() {
//
//    }

    @Override
    void turaMedic() {
        System.out.println("Salvez 2 persoane");
    }

    @Override
    void turaPrimar() {
        System.out.println("Votez de 5 ori");
    }

    @Override
    void turaAssassin() {
        System.out.println("Scot din joc 0 persoane");
    }

    @Override
    void turaPolitist() {
        System.out.println("Interoghez 1 persoana");
    }
}
