package com.StudentManagement.StudentManagement.mapper;

import com.StudentManagement.StudentManagement.controller.StudentController;
import com.StudentManagement.StudentManagement.dto.request.ProfileCreateDTO;
import com.StudentManagement.StudentManagement.dto.request.StudentCreateDTO;
import com.StudentManagement.StudentManagement.dto.response.ProfileViewDTO;
import com.StudentManagement.StudentManagement.dto.response.StudentViewDTO;
import com.StudentManagement.StudentManagement.entity.Profile;
import com.StudentManagement.StudentManagement.entity.Student;
import org.mapstruct.*;

import java.util.List;

@Mapper(
        componentModel = MappingConstants.ComponentModel.SPRING,
        uses = ProfileMapper.class  // <--- IMPORTANT
)
public interface StudentMapper {

    @Mapping(target = "profile", source = "profileCreateDTO")
    Student toEntity(StudentCreateDTO dto);

    @Mapping(target = "profileViewDTO", source = "profile")
    StudentViewDTO toView(Student entity);

    List<StudentViewDTO> toView(List<Student> allStudent);
}
