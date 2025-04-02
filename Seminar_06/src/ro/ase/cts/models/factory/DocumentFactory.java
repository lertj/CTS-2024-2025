package ro.ase.cts.models.factory;

import ro.ase.cts.enums.DocumentType;

public class DocumentFactory {
    public static DocumentClasic getDocument(DocumentType type, String title, String content){
        switch (type){
            case PDF: return new DocumentPDF(title, content);
            case HTML: return new DocumentHTML(title, content);
            default: throw new UnsupportedOperationException();
            //case DOCX: return new DocumentHTML(title, content); break;
        }
    }
}
