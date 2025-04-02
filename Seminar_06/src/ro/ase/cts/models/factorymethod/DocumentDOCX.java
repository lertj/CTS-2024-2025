package ro.ase.cts.models.factorymethod;

public class DocumentDOCX extends DocumentClasic {

    String prefix = "!DOCX\n";

    DocumentDOCX(String title, String content) {
        this.title = title;
        this.content = content;
    }

    @Override
    public void export() {
        System.out.println(prefix+this.content);
    }
}
