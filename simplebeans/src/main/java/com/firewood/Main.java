package com.firewood;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(CounterConfiguration.class);

        Counter counter1 = context.getBean(Counter.class);
        System.out.println(counter1.getCount()); // 0
        Counter counter2 = context.getBean(Counter.class);
        System.out.println(counter2.getCount()); // 1
    }
}
