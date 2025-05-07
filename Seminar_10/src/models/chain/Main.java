package models.chain;

public class Main {
    public static void main(String[] args) {
        ModuleFilterExclamation m1 = new ModuleFilterExclamation();
        ModuleFilterProfanity m2 = new ModuleFilterProfanity();

        m1.setNext(m2);
        m2.setNext(new ModuleSend());

        m1.process(new String[]{"abcd", "test", "ura", "ceva!", "of...", "aoleu!"});
    }
}
