package ro.ase.cts.models.prototype;

import ro.ase.cts.enums.DocumentType;
import java.util.HashMap;

public class DocumentPrototypeFactory {

    private static HashMap<String, DocumentClasic> prototypes = new HashMap<>();

    static{ // eager variant; lazy variant is similar to Singleton registry
        prototypes.put("DOCX", new DocumentDOCX("singurulDOCX", "intempestiv"));
        prototypes.put("PDF", new DocumentPDF("unPDF", "extemporal"));
    }

    public static DocumentClasic getDocument(DocumentType type) throws CloneNotSupportedException {
        switch(type){
            case PDF: return (DocumentClasic) prototypes.get("PDF").clone();
            case DOCX: return (DocumentClasic) prototypes.get("DOCX").clone();
            default: throw new UnsupportedOperationException();
        }

    }
}
