package ru.job4j.di;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        context.reg(Store.class);
        context.reg(ConsoleInput.class);
        context.reg(StartUI.class);

        StartUI ui = context.get(StartUI.class);
        ui.add("Petr Arsentev");
        ui.add("Ivan ivanov");
        ui.print();

        /**
         *  мы сами не создаем объекты классов Store StartUI за нас это делает Context
         */

        ui.add(ui.askString("What`s your name?"));
        ui.add(ui.askString("What`s your surname?"));
        ui.print();
    }
}
