package ru.job4j.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
public class StartUI {
    @Autowired
    private Store store;
    @Autowired
    private ConsoleInput input;

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