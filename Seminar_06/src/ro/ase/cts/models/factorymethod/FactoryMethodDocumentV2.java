package ro.ase.cts.models.factorymethod;

import ro.ase.cts.enums.DocumentType;

public class FactoryMethodDocumentV2 extends AFactory {
    public DocumentClasic getDocument(DocumentType type, String title, String content){
        switch (type){
            case PDF: return new DocumentPDF(title, content, "semnat, Lucian");
            case HTML: return new DocumentDOCX(title, content);
            default: throw new UnsupportedOperationException();
                //case DOCX: return new DocumentHTML(title, content); break;
        }
    }
}
