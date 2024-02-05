package com.springjpa.springdatajpainitial.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "tbl_student")
public class Student {
    @Id
    @GeneratedValue
    private Long studentId;
    private String firstName;
    private String lastName;

    @Column(name = "email_address")
    private String emailId;
    private String guardianName;
    private String guardianEmail;
    private String guardianMobile;
}
