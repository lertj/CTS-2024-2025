package ase.cts.ro.composite;

import java.util.ArrayList;
import java.util.List;

public class ITGroup extends ANod{
    List<ANod> employees = new ArrayList<>();

    public ITGroup(String name) {
        super(name);
    }

    @Override
    public void addEmployee(ANod employee) {
        employees.add(employee);
    }

    @Override
    public ANod getEmployee(String name) {
        for(ANod node: this.employees){
            if(node.name.equals(name)){
                return node;
            }
        }
        return null;
    }

    @Override
    public void removeEmployee(int index) {
        if(index>=0 && index< employees.size()){
            employees.remove(index);
        }
    }

    @Override
    public String printDetails() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nGroup name: " + name + " | Employees: \n");
        for(ANod node: this.employees){
            sb.append(node.printDetails() + "\t");
        }

        return sb.toString();
    }
}














