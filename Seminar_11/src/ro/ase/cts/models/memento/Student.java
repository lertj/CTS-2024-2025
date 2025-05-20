package ro.ase.cts.models.memento;

import java.util.Arrays;

public class Student {
    String name;
    String faculty; // toSave
    int[] grades; // toSave

    public Student(String name, String faculty, int[] grades) {
        this.name = name;
        this.faculty = faculty;
        this.grades = grades;
    }

    public MementoStudent saveStud(){
        System.out.println("Se salveaza studentul " + this.name);
        return new MementoStudent(this.faculty, this.grades);
    }

    public void loadStud(MementoStudent stud){
        this.faculty = stud.faculty;
        this.grades = Arrays.copyOf(stud.grades, stud.grades.length);
    }

    public void addGrade(int x){
        int[] copy = Arrays.copyOf(this.grades, this.grades.length + 1);
        copy[this.grades.length] = x;
        this.grades = copy;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", faculty='" + faculty + '\'' +
                ", grades=" + Arrays.toString(grades) +
                '}';
    }
}












