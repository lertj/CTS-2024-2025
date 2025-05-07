package models.adaptor.classes;

import models.adaptor.interfaces.IoldEditorable;

public class myEditor implements IoldEditorable {
    String text;

    public myEditor(String text) {
        this.text = text;
    }

    @Override
    public String getText() {
        return this.text;
    }

    @Override
    public void setText(String text) {
        this.text=text;
    }

    @Override
    public void displayText() {
        System.out.println("My editor: " + this.text);
    }


}
