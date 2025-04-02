package ro.ase.cts.models.factory;

public class DocumentHTML extends DocumentClasic{

    String prefix = "<HTML>\n";

    public DocumentHTML(String title, String content) {
        this.title = title;
        this.content = content;
    }

    @Override
    public void export() {
        System.out.println(prefix+this.content);
    }
}
