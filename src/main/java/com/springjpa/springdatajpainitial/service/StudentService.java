package com.springjpa.springdatajpainitial.service;

import com.springjpa.springdatajpainitial.entity.Student;

import java.util.List;

public interface StudentService {
     List<Student> buildStudentProfile(String firstName, String lastName, String emailID, String guardianName, String guardianEmail);
}
