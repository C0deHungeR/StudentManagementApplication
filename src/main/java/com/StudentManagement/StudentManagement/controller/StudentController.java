package com.StudentManagement.StudentManagement.controller;

import com.StudentManagement.StudentManagement.dto.request.StudentCreateDTO;
import com.StudentManagement.StudentManagement.dto.response.StudentViewDTO;
import com.StudentManagement.StudentManagement.mapper.StudentMapper;
import com.StudentManagement.StudentManagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService ;



    @PostMapping
    private StudentViewDTO createStudent(@RequestBody StudentCreateDTO dto){
        return studentService.create(dto);
    }

    @GetMapping("/{id}")
    private StudentViewDTO getStudent(@PathVariable Long id){
        return studentService.getStudent(id);
    }

    @GetMapping
    private List<StudentViewDTO> getStudents(){
        return studentService.getAllStudent();
    }
}
