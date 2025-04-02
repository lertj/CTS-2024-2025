package ro.ase.cts.models.prototype;


import ro.ase.cts.enums.DocumentType;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        DocumentPDF pdfprototype = new DocumentPDF();
        DocumentPDF pdfprototype2 = (DocumentPDF) pdfprototype.clone();
        pdfprototype2 = (DocumentPDF) pdfprototype.clone();
        pdfprototype2 = (DocumentPDF) pdfprototype.clone();
        System.out.println("Prototype a fost testat...\n\n");

        pdfprototype2 = (DocumentPDF) DocumentPrototypeFactory.getDocument(DocumentType.PDF);
        pdfprototype2.export();
        DocumentDOCX docxProtFactory = (DocumentDOCX) DocumentPrototypeFactory.getDocument(DocumentType.DOCX);
        docxProtFactory.export();
        System.out.println("Prototype Factory a fost testat...");
    }
}
