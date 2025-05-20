package ro.ase.cts.models.memento.main;

import ro.ase.cts.models.memento.HistoryStudent;
import ro.ase.cts.models.memento.MementoStudent;
import ro.ase.cts.models.memento.Student;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Student stud = new Student("Valentininca", "CSIE", new int[]{9,9,10});

        stud.addGrade(5);
        System.out.println(stud);
        MementoStudent candErabine = stud.saveStud();
        stud.addGrade(2);
        stud.addGrade(1);
        Thread.sleep(1000);
        MementoStudent canderarau =  stud.saveStud();
        stud.loadStud(candErabine);
        System.out.println(stud);

        stud.addGrade(7);
        stud.addGrade(4);
        HistoryStudent historyStudent = new HistoryStudent();
        historyStudent.addStudState(candErabine);
        historyStudent.addStudState(canderarau);
        historyStudent.addStudState(stud.saveStud());

        long timeForRollback = canderarau.getTimestamp();
        stud.loadStud(historyStudent.getStateStud(timeForRollback));
        System.out.println(stud);

    }
}
