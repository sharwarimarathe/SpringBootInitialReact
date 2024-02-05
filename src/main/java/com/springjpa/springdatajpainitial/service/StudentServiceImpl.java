package com.springjpa.springdatajpainitial.service;

import com.springjpa.springdatajpainitial.Daos.StudentDAO;
import com.springjpa.springdatajpainitial.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentDAO studentDAO;

    @Override
    public List<Student> buildStudentProfile(String firstName, String lastName, String emailID, String guardianName, String guardianEmail) {
        studentDAO.buildStudentRecord(firstName, lastName, emailID, guardianName, guardianEmail);
        return studentDAO.fetchStudentRecords();
    }
}
