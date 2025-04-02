package ro.ase.cts.models.factory;

import ro.ase.cts.enums.DocumentType;

public class Main {
    public static void main(String[] args) {

//        DocumentPDF pdf = new DocumentPDF("fisier.pdf", "acesta este un PDF");
        DocumentClasic html = new DocumentHTML("test.html", "<div></div>");
//        pdf.export();
        html.export();

        DocumentPDF createdPdf = (DocumentPDF) DocumentFactory.getDocument(DocumentType.PDF, "fisier.pdf", "ceva" );
        createdPdf.export();
    }
}