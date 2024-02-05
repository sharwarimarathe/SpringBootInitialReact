package com.springjpa.springdatajpainitial;

import com.springjpa.springdatajpainitial.Daos.StudentDAO;
import com.springjpa.springdatajpainitial.entity.Student;
import com.springjpa.springdatajpainitial.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
class RandomTests {
    @Autowired
    StudentRepository studentRepository;

    @Autowired
    StudentDAO studentDAO;

    @Test
    void testStudentRepository() {
    studentDAO.buildStudentRecord("Mohan", "Shetty", "mohan.shetty@gmail.com", "Ravi", "ravi.tandon@gmail.com");
    studentRepository.deleteAll();
    System.out.println(studentRepository.findAll().size());
    }
}
