package ru.job4j.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDI {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("ru.job4j.di");
        /**
         * Чтобы Spring понял, какие классы нужно зарегистрировать в Context нужно эти классы пометить аннотацией @Component.
         * Чтобы ручками не регистрировать. Просто добавляем нужный пакет и с классами, которыми работаем вешаем @Component
         *    context.register(Store.class);
         *    context.register(ConsoleInput.class);
         *    context.register(StartUI.class);
         */

        context.refresh();
        StartUI ui = context.getBean(StartUI.class);
        ui.add("Petr Arsentev");
        ui.add("Ivan ivanov");
        ui.add(ui.askString("What is your name?"));
        ui.add(ui.askString("What is your name?"));
        ui.print();
    }
}