package ro.ase.cts.models.prototype;

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

    @Override
    protected Object clone() throws CloneNotSupportedException { // ATENTIE LA SHALLOW COPY
        DocumentDOCX clone = new DocumentDOCX(this.title, this.content);
        System.out.println("Clone created!");
        return clone;
    }
}
