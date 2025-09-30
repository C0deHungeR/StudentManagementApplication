package com.StudentManagement.StudentManagement.dto.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Optional;

@Getter @Setter @NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_ABSENT)
public class AddressPatchDTO {
    private Optional<String> line1 = Optional.empty();
    private Optional<String> line2 = Optional.empty();
    private Optional<String> city = Optional.empty();
    private Optional<String> state = Optional.empty();
    private Optional<String> postalCode = Optional.empty();
    private Optional<String> country = Optional.empty();
}
