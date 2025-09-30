package com.StudentManagement.StudentManagement.dto.response;

import jakarta.validation.Valid;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@NoArgsConstructor @Getter @Setter
public class ProfileViewDTO {

    private LocalDate dateOfBirth ;
    private String phone;
    private AddressViewDTO addressViewDTO ;
    private String avatarUrl;

}
