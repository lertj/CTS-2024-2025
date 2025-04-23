package ase.cts.ro.composite;

public class ITguy extends ANod{

    public ITguy(String name, int salary) {
        super(name);
        this.salary = salary;
    }

    @Override
    public void addEmployee(ANod employee) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ANod getEmployee(String name) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void removeEmployee(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String printDetails() {
        String info = "";
        info += "Nume: " + this.name;
        info += " | ";
        info += "Salariu: " + this.salary;

        return info;
    }
}















