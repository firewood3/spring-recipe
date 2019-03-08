package com.firewood.config;

import com.firewood.Business;
import com.firewood.Person;
import com.firewood.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersonConfiguration {

    @Bean
    public Person student() {
        Student student = new Student("kevin",17);
        student.setSchoolName("jeju international high school");
        student.setStudentNumber(2019224774);
        return student;
    }

    @Bean
    public Person business() {
        Business business = new Business("marry", 33);
        business.setCompanyName("bitnine");
        return business;
    }
}
