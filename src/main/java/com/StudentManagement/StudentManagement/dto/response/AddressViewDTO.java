package com.StudentManagement.StudentManagement.dto.response;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor @Getter @Setter
public class AddressViewDTO {

    private String line1;
    private String line2;
    private String city;
    private String state;
    private String postalCode;
    private String country;
}
