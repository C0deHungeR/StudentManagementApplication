package com.StudentManagement.StudentManagement.mapper;

import com.StudentManagement.StudentManagement.dto.request.AddressCreateDTO;
import com.StudentManagement.StudentManagement.dto.response.AddressViewDTO;
import com.StudentManagement.StudentManagement.entity.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface  AddressMapper {
    Address toEntity(AddressCreateDTO dto);
    AddressViewDTO toView(Address entity);
}
