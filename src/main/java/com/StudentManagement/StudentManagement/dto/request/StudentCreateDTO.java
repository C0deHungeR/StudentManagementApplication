package com.StudentManagement.StudentManagement.dto.request;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter @NoArgsConstructor
public class StudentCreateDTO {

    @NotBlank(message = "Name cannot be blank")
    private String name;

    @Email(message = "Email must be valid")
    @NotBlank(message = "Email field cannot be blank")
    private String email;

    @NotNull(message = "enrollment date is required")
    private LocalDate enrollmentDate;

    @Valid
    private ProfileCreateDTO profileCreateDTO ;

}
