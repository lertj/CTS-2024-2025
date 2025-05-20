package ro.ase.cts.models.template;

public class MafiaReloaded extends AMafia{

//    @Override
//    public void joaca1Tura() {
//
//    }

    @Override
    void turaMedic() {
        System.out.println("Salvez o persoana");
    }

    @Override
    void turaPrimar() {
        System.out.println("Votez o singura data");
    }

    @Override
    void turaAssassin() {
        System.out.println("Scot din joc 2 persoane");
    }

    @Override
    void turaPolitist() {
        System.out.println("Interoghez 2 persoane");
    }
}
