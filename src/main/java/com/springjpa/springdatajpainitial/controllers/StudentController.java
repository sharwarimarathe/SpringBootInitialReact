package com.springjpa.springdatajpainitial.controllers;

import com.springjpa.springdatajpainitial.entity.Student;
import com.springjpa.springdatajpainitial.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

import static java.lang.Long.parseLong;

@Slf4j
@RestController
@RequestMapping("/api")
public class StudentController {
    @Autowired
    StudentService studentService;

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/create-profile")
    public List<Student> createStudentProfile(@RequestBody Map<String, String> payload) {
        log.info("Student id: {}", payload.get("studentID"));
        return studentService.buildStudentProfile(payload.get("firstName"), payload.get("lastName"), payload.get("email"), payload.get("guardianName"), payload.get("guardianEmail"));
    }
}
