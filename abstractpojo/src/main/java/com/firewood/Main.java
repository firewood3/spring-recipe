package com.firewood;

import com.firewood.config.PersonConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(PersonConfiguration.class);

        Person student = context.getBean("student", Person.class);
        Person business = context.getBean("business", Person.class);

        System.out.println(student); //Person(name=kevin, age=17) And School Name : jeju international high school
        System.out.println(business); //Person(name=marry, age=33) And CompanyName : bitnine

    }
}
