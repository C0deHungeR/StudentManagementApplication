package com.StudentManagement.StudentManagement.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class AddressCreateDTO {

    @NotBlank(message = "line1 is required")
    private String line1;

    private String line2;

    @NotBlank(message = "city is required")
    private String city;

    private String state;

    @Pattern(regexp = "^[A-Za-z0-9 -]{3,10}$",
            message = "postalCode must be 3-10 letters/digits")
    private String postalCode;

    @NotBlank(message = "country is required")
    private String country;
}
