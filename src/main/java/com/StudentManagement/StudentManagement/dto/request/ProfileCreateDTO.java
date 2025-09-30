package com.StudentManagement.StudentManagement.dto.request;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter @NoArgsConstructor
public class ProfileCreateDTO {

    @Past(message = "dateOfBirth must be in the past")
    private LocalDate dateOfBirth;

    @Pattern(regexp = "^[+0-9() -]{7,20}$",
            message = "phone must be 7-20 digits/symbols")
    private String phone;

    private String avatarUrl;

    @Valid
    private AddressCreateDTO addressCreateDTO;
}
