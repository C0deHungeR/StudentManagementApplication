package com.StudentManagement.StudentManagement.dto.response;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@NoArgsConstructor
@Getter
@Setter
public class StudentViewDTO {

    private Long id;
    private String collegeId;
    private Integer rollNo;
    private String name;
    private String email;
    private LocalDate enrollmentDate;

    // choose nested view or just profileId depending on endpoint needs
    private ProfileViewDTO profileViewDTO;
}
