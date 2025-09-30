package com.StudentManagement.StudentManagement.dto.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.Entity;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Optional;

@NoArgsConstructor
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_ABSENT)
public class StudentPatchDTO {
    private Optional<String> name = Optional.empty();

    @Email(message = "email must be valid")
    private Optional<String> email = Optional.empty();

    private Optional<Integer> rollNo = Optional.empty();

    private Optional<LocalDate> enrollmentDate = Optional.empty();

    @Valid
    private Optional<ProfilePatchDTO> profile = Optional.empty();
}
