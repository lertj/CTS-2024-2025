package models.chain;

import java.util.Arrays;

public class ModuleFilterProfanity extends AbstractModule {
//    public ModuleFilterProfanity(AbstractModule next) {
//        this.next = next;
//    } // nu este recomandat


    public ModuleFilterProfanity() {
    }

    @Override
    void process(String[] text) {
        String[] filteredText = Arrays.stream(text).filter((s) -> !s.contains("ura")).toArray(String[]::new);

        if(next != null)
            next.process(filteredText);
    }

    @Override
    void setNext(AbstractModule next) {
        this.next = next;
    }
}
