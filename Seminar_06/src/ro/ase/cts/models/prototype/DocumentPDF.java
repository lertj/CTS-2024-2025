package ro.ase.cts.models.prototype;

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

    DocumentPDF(){
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
    public Object clone() throws CloneNotSupportedException { // ATENTIE LA SHALLOW COPY
        DocumentPDF clone = new DocumentPDF(this.title, this.content, this.suffix);
        System.out.println("Clone created!");
        return clone;
    }
}
