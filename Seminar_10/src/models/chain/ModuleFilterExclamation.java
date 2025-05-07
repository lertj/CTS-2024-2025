package models.chain;

import java.util.Arrays;

public class ModuleFilterExclamation extends AbstractModule {
    @Override
    void process(String[] text) {
        String[] filteredText =  Arrays.stream(text).filter((s) -> !s.contains("!")).toArray(String[]::new);
        if(next != null)
            next.process(filteredText);
    }

    @Override
    void setNext(AbstractModule next) {
        this.next = next;
    }
}
