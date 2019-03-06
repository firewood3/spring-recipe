package com.firewood.student.dao;

import com.firewood.student.domain.Student;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("studentDao")
public class StudentDaoImpl implements StudentDao {

    private final List<Student> students = new ArrayList<Student>();

    public StudentDaoImpl() {
        students.add(new Student(0, "Kim"));
        students.add(new Student(1, "Lee"));
        students.add(new Student(2, "Park"));
    }

    public Student getStudentById(int id) {
        return students.get(id);
    }
}
