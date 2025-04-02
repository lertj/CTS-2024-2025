package ro.ase.cts.models.factory;

public class DocumentPDF extends DocumentClasic implements Cloneable {
    String prefix = "<PDF>\n";
    String suffix = "";

    public DocumentPDF(String title, String content, String suffix) {
        this.title = title;
        this.content = content;
        this.suffix = suffix;
    }

    public DocumentPDF(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public DocumentPDF(){
        try {
            System.out.println("Procesam ceva...");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void export() {
        System.out.println(prefix+this.content+"\n"+this.suffix);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
