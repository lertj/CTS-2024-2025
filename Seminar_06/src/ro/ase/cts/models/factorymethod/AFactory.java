package ro.ase.cts.models.factorymethod;

import ro.ase.cts.enums.DocumentType;

public abstract class AFactory { //factory method abstract class
    public abstract DocumentClasic getDocument(DocumentType type, String title, String content);
}
