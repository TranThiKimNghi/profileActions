package com.example.Nghi.servicce;

import com.example.Nghi.model.Profile;
import com.example.Nghi.repository.ProfileRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfileService {

    private final ProfileRepository repository;

    public ProfileService(ProfileRepository repository) {
        this.repository = repository;
    }

    public List<Profile> getAllProfiles() {
        return repository.findAll();
    }

    public Profile createProfile(Profile profile) {
        return repository.save(profile);
    }

    public Profile getProfileById(Long id) {
        return repository.findById(id).orElse(null);
    }
}