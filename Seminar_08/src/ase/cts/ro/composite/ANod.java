package ase.cts.ro.composite;

public abstract class ANod {

    String name;
    int salary;

    ANod(String name){
        super();
        this.name = name;
    }

    //v1
    public abstract void addEmployee(ANod employee);
    public abstract ANod getEmployee(String name);
    public abstract void removeEmployee(int index);

    //v2
//    public void addEmployee(ANod employee){
//        throw new UnsupportedOperationException();
//    }
//    public ANod getEmployee(String name){
//        throw new UnsupportedOperationException();
//    }
//    public void removeEmployee(int index){
//        throw new UnsupportedOperationException();
//    }

    abstract String printDetails();
}







