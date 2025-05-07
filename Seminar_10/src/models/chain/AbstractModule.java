package models.chain;

public abstract class AbstractModule {
    AbstractModule next;

    abstract void process(String[] text);
    abstract void setNext(AbstractModule next);
}
