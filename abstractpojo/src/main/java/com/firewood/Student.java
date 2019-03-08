package com.firewood;

import lombok.Data;
import lombok.Setter;
import lombok.ToString;

@Setter
public class Student extends Person{
    private String schoolName;
    private int studentNumber;

    public Student(){ super(); }

    public Student(String name, int age) {
        super(name, age);
    }

    public String toString() {
        return super.toString() + " And School Name : " + this.schoolName;
    }
}
