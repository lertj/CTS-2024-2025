package models.adaptor;

import models.adaptor.classes.myEditor;
import models.adaptor.classes.newEditor;
import models.adaptor.interfaces.InewEditorable;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        myEditor myEditor = new myEditor("Lalalalalal");
        myEditor.displayText();


        newEditor newEditor = new newEditor(new String[]{"text1", "text2"});

        newEditor newEditor2 = new newEditor(new String[]{"text3", "text4"});

        List<InewEditorable> newEditors = new ArrayList<>();
        newEditors.add(newEditor2);
        newEditors.add(newEditor);

        OldToNewAdaptor adaptor = new OldToNewAdaptor(myEditor);
        adaptor.showText();

        newEditors.add(adaptor);
        for(InewEditorable ne : newEditors){
            ne.showText();
        }


    }
}