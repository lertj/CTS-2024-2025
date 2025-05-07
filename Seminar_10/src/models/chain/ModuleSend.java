package models.chain;

import java.util.Arrays;

public class ModuleSend extends AbstractModule {
    public ModuleSend() {
    }

    @Override
    void process(String[] text) {
        String[] filteredText = Arrays.stream(text).filter((s) -> !s.contains("ura")).toArray(String[]::new);

        Arrays.stream(filteredText).forEach(System.out::println);
    }

    @Override
    void setNext(AbstractModule next) {
        this.next = next;
    }
}
