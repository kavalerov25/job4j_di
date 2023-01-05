package ru.job4j.di;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
public class StartUI {

    private Store store;
    private ConsoleInput input;

    public StartUI(Store store, ConsoleInput input) {
        this.store = store;
        this.input = input;
    }

    public void add(String value) {
        store.add(value);
    }

    public void print() {
        for (String value : store.getAll()) {
            System.out.println(value);
        }
    }

    public String askString(String question) {
        return input.askString(question);
    }
}