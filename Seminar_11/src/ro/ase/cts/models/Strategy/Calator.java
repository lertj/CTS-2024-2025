package ro.ase.cts.models.Strategy;

public class Calator {
    int timp;
    int bani;
    Transportable strategy;

    public Calator(int timp, int bani) {
        this.timp = timp;
        this.bani = bani;
    }

    public void setStrategy(Transportable strategy) {
        this.strategy = strategy;
    }

    public void mergeInVacanta(){
        if(strategy != null){
            strategy.calatorim();
        }
    }
}
