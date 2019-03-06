package com.firewood;

import com.firewood.student.dao.StudentDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.firewood");

        StudentDao studentDao = context.getBean(StudentDao.class);

        System.out.println(studentDao.getStudentById(0).getName()); //Kim
        System.out.println(studentDao.getStudentById(1).getName()); //Lee
        System.out.println(studentDao.getStudentById(2).getName()); //Park
    }
}
