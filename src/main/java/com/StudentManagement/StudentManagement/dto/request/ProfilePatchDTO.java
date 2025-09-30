package com.StudentManagement.StudentManagement.dto.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.Valid;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDate;
import java.util.Optional;

@NoArgsConstructor
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_ABSENT)
public class ProfilePatchDTO {
    private Optional<LocalDate> dateOfBirth = Optional.empty();
    private Optional<String> phone = Optional.empty();
    private Optional<String> avatarUrl = Optional.empty();

    @Valid
    private Optional<AddressPatchDTO> address = Optional.empty();
}
