package ro.ase.cts.models.Strategy;

public class Main {
    public static void main(String[] args) {
        Calator c = new Calator(0, 100);
        if(c.bani < 20 && c.timp > 80){
            c.setStrategy(new CalatoriePeJos());
        } else if(c.bani > 80 && c.timp < 10){
            c.setStrategy(new CalatorieCuAvionul());
        } else {
            c.setStrategy(new Transportable() {
                @Override
                public void calatorim() {
                    System.out.println("Calatorim cu trenul...");
                }
            });
        }

        c.mergeInVacanta();
    }
}
