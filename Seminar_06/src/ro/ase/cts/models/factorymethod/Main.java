package ro.ase.cts.models.factorymethod;

import ro.ase.cts.enums.DocumentType;

public class Main {
    public static void main(String[] args) {

        AFactory aFactory = new FactoryMethodDocumentV1();
        DocumentPDF createdPdf2 = (DocumentPDF) aFactory.getDocument(DocumentType.PDF, "abcd.pdf", "guacamole");
        createdPdf2.export();
        aFactory = new FactoryMethodDocumentV2();
        createdPdf2 = (DocumentPDF) aFactory.getDocument(DocumentType.PDF, "abcd.pdf", "salsa");
        createdPdf2.export();
    }
}