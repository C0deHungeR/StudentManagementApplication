package com.StudentManagement.StudentManagement.controller;

import com.StudentManagement.StudentManagement.dto.request.ProfileCreateDTO;
import com.StudentManagement.StudentManagement.dto.response.ProfileViewDTO;
import com.StudentManagement.StudentManagement.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/profile")
public class ProfileController {

    @Autowired
    private ProfileService profileService ;

    @PostMapping()
    private ProfileViewDTO createProfile(@RequestBody ProfileCreateDTO dto){
        return profileService.create(dto);
    }

    @GetMapping("/{id}")
    private ProfileViewDTO getProfile(@PathVariable Long id){
        return profileService.get(id);
    }
}
