package ro.ase.cts.models.memento;

import java.util.ArrayList;
import java.util.List;

public class HistoryStudent {
    List<MementoStudent> history = new ArrayList<>();

    public void addStudState(MementoStudent stud){
        history.add(stud);
    }

    public MementoStudent getStateStud(long timestamp){
        for(MementoStudent m : history){
            if(m.timestamp == timestamp){
                return m;
            }
        }
        return null;
    }
}
