package com.StudentManagement.StudentManagement.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;


@Entity
@Table(
        name = "student",
        uniqueConstraints = {
                @UniqueConstraint(name = "uk_student_roll_no",columnNames = "roll_no"),
                @UniqueConstraint(name = "uk_student_email",columnNames = "email"),
                @UniqueConstraint(name = "uk_student_college_id",columnNames = "college_id"),
                @UniqueConstraint(name = "uk_student_profile_id",columnNames = "profile_id")
        }
)
@Getter
@Setter
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(nullable = false)
    private String name;

    @Column(unique = true,nullable = false)
    private String email;

    @Column(name = "enrollment_date",nullable = false)
    private LocalDate enrollmentDate ;


    @OneToOne(cascade = {CascadeType.PERSIST,CascadeType.MERGE})
    @JoinColumn(name = "profile_id")
    private Profile profile;

}
