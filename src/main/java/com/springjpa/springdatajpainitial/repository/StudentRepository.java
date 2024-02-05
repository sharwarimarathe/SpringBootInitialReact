package com.springjpa.springdatajpainitial.repository;

import com.springjpa.springdatajpainitial.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
