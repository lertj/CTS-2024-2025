package ro.ase.cts.models.prototype;

public abstract class DocumentClasic {
    String title;
    String content;

    abstract public void export();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
