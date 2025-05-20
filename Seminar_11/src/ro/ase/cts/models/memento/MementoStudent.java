package ro.ase.cts.models.memento;

import java.util.Arrays;

public class MementoStudent {
    String faculty; // toSave
    int[] grades; // toSave

    long timestamp; // specific implementarii curente de Memento

    MementoStudent(String faculty, int[] grades) {
        this.faculty = faculty;
        this.grades = Arrays.copyOf(grades, grades.length);
        this.timestamp = System.currentTimeMillis();
    }

    public int[] getGrades() {
        return grades;
    }

    public String getFaculty() {
        return faculty;
    }

    public long getTimestamp(){
        return timestamp;
    }
}
