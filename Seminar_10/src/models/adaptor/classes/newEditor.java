package models.adaptor.classes;

import models.adaptor.interfaces.InewEditorable;

import java.util.Arrays;

public class newEditor implements InewEditorable {
    String[] text;

    public newEditor(String[] text) {
        this.text = new String[text.length];
        for(int i =0; i < text.length; i++){
            this.text[i]=text[i];
        }
    }

    @Override
    public String[] getText() {
        Arrays.copyOf(this.text, this.text.length);
        return this.text;
    }

    @Override
    public void setText(String[] text) {
        this.text = new String[text.length];
        for(int i =0; i < text.length; i++){
            this.text[i]=text[i];
        }
    }

    @Override
    public void showText() {
        Arrays.stream(this.text).forEach(System.out::println);
    }
}
