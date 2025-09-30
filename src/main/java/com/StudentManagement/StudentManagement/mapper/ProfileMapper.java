package com.StudentManagement.StudentManagement.mapper;

import com.StudentManagement.StudentManagement.dto.request.AddressCreateDTO;
import com.StudentManagement.StudentManagement.dto.request.AddressPatchDTO;
import com.StudentManagement.StudentManagement.dto.request.ProfileCreateDTO;
import com.StudentManagement.StudentManagement.dto.request.ProfilePatchDTO;
import com.StudentManagement.StudentManagement.dto.response.AddressViewDTO;
import com.StudentManagement.StudentManagement.dto.response.ProfileViewDTO;
import com.StudentManagement.StudentManagement.entity.Address;
import com.StudentManagement.StudentManagement.entity.Profile;
import org.mapstruct.*;

import java.util.List;
import java.util.Optional;

@Mapper(componentModel = "spring",uses = {AddressMapper.class})
public interface ProfileMapper {

    @Mapping(source = "addressCreateDTO",target = "address")
    Profile toEntity(ProfileCreateDTO dto);

    @Mapping(source = "address",target = "addressViewDTO")
    ProfileViewDTO toView(Profile entity);

    List<ProfileViewDTO> toView(List<Profile> profiles);
}