package com.springjpa.springdatajpainitial.Daos;

import com.springjpa.springdatajpainitial.entity.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;


public interface StudentDAO {
    void buildStudentRecord(String firstName, String lastName, String emailID, String guardianName, String guardianEmail);

    List<Student> fetchStudentRecords();
}
