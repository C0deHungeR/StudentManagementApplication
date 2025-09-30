package com.StudentManagement.StudentManagement.service;

import com.StudentManagement.StudentManagement.dto.request.StudentCreateDTO;
import com.StudentManagement.StudentManagement.dto.response.StudentViewDTO;
import com.StudentManagement.StudentManagement.entity.Student;
import com.StudentManagement.StudentManagement.exception.NotFoundException;
import com.StudentManagement.StudentManagement.mapper.AddressMapper;
import com.StudentManagement.StudentManagement.mapper.ProfileMapper;
import com.StudentManagement.StudentManagement.mapper.StudentMapper;
import com.StudentManagement.StudentManagement.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository ;
    @Autowired
    private StudentMapper studentMapper ;
    @Autowired
    private ProfileMapper profileMapper ;

    @Autowired
    private AddressMapper addressMapper ;

    public StudentViewDTO create(StudentCreateDTO dto){
        Student s = studentMapper.toEntity(dto);
        Student saved = studentRepository.save(s);
        return studentMapper.toView(saved);
    }

    public StudentViewDTO getStudent(Long id){
        Student s = studentRepository.findById(id).orElseThrow(
                ()-> new NotFoundException("Student not Found")
        );
        return studentMapper.toView(s);
    }

    public List<StudentViewDTO> getAllStudent(){
        List<Student> allStudent = studentRepository.findAll();
        return studentMapper.toView(allStudent);
    }



}
