package com.springjpa.springdatajpainitial.Daos;

import com.springjpa.springdatajpainitial.entity.Student;
import com.springjpa.springdatajpainitial.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDAOImpl implements StudentDAO{
    @Autowired
    StudentRepository studentRepository;

    @Override
    public void buildStudentRecord(String firstName, String lastName, String emailID, String guardianName, String guardianEmail) {
        Student student = Student.builder().firstName(firstName).lastName(lastName).emailId(emailID).guardianName(guardianName).guardianEmail(guardianEmail).build();
        studentRepository.save(student);
    }

    @Override
    public List<Student> fetchStudentRecords() {
        return studentRepository.findAll();
    }
}
