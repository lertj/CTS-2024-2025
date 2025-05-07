package models.adaptor;

import models.adaptor.interfaces.InewEditorable;
import models.adaptor.interfaces.IoldEditorable;

public class OldToNewAdaptor implements InewEditorable {
    private IoldEditorable reference;

    public OldToNewAdaptor(IoldEditorable reference) {
        this.reference = reference;
    }

    @Override
    public String[] getText() {
        return reference.getText().split(" ");
    }

    @Override
    public void setText(String[] text) {
        reference.setText(String.join(" ",text));
    }

    @Override
    public void showText() {
        reference.displayText();
    }
}
