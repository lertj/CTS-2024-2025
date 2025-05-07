package models.chain;

public class Main {
    public static void main(String[] args) {
        ModuleFilterExclamation m1 = new ModuleFilterExclamation();
        ModuleFilterProfanity m2 = new ModuleFilterProfanity();

        m2.setNext(m1);

        m2.process(new String[]{"abcd", "test", "ura", "ceva!"});
    }
}
