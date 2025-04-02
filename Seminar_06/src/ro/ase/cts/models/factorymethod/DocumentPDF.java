package ro.ase.cts.models.factorymethod;

public class DocumentPDF extends DocumentClasic implements Cloneable {
    String prefix = "<PDF>\n";
    String suffix = "";

    DocumentPDF(String title, String content, String suffix) {
        this.title = title;
        this.content = content;
        this.suffix = suffix;
    }

    DocumentPDF(String title, String content) {
        this.title = title;
        this.content = content;
    }

    @Override
    public void export() {
        System.out.println(prefix+this.content+"\n"+this.suffix);
    }

}
