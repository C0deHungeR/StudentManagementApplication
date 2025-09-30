package com.StudentManagement.StudentManagement.service;

import com.StudentManagement.StudentManagement.dto.request.ProfileCreateDTO;
import com.StudentManagement.StudentManagement.dto.request.ProfilePatchDTO;
import com.StudentManagement.StudentManagement.dto.response.ProfileViewDTO;
import com.StudentManagement.StudentManagement.entity.Profile;
import com.StudentManagement.StudentManagement.exception.NotFoundException;
import com.StudentManagement.StudentManagement.mapper.AddressMapper;
import com.StudentManagement.StudentManagement.mapper.ProfileMapper;
import com.StudentManagement.StudentManagement.repository.ProfileRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class ProfileService {

    @Autowired
    private ProfileRepository profileRepository;

    @Autowired
    private AddressMapper addressMapper ;

    @Autowired
    private ProfileMapper profileMapper;

    // creating profile using dto
    public ProfileViewDTO create(ProfileCreateDTO profileCreateDTO) {
        Profile profile = profileMapper.toEntity(profileCreateDTO);
        Profile saved = profileRepository.save(profile);
        return profileMapper.toView(saved);
    }

    //getting profile
    public ProfileViewDTO get(Long id){
        Profile entity = profileRepository.findById(id).orElseThrow(() -> new NotFoundException("Profile not Fount"));
        return profileMapper.toView(entity);
    }

    //getting all the lists
    public List<ProfileViewDTO> list(){
        List<Profile> profiles = profileRepository.findAll();
        return profileMapper.toView(profiles);
    }

    //deleting profile
    @Transactional // write transaction
    public void delete(Long id) {
        Profile profile = profileRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Profile " + id + " not found"));
        profileRepository.delete(profile);
    }


}
