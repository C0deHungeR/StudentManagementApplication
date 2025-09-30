package com.StudentManagement.StudentManagement.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.GeneratedValue;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
public class Address {

    @Column(name = "addr_line1")
    private String line1;

    @Column(name = "addr_line2")
    private String line2;

    @Column(name = "addr_city")
    private String city;

    @Column(name = "addr_state")
    private String state;

    @Column(name = "addr_postal_code")
    private String postalCode;

    @Column(name = "addr_country")
    private String country;
}
