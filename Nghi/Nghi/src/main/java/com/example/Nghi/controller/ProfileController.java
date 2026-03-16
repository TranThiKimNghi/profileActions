package com.example.Nghi.controller;

import com.example.Nghi.model.Profile;
import com.example.Nghi.servicce.ProfileService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class ProfileController {

    private final ProfileService service;

    public ProfileController(ProfileService service) {
        this.service = service;
    }

    @GetMapping("/")
    public List<Profile> getProfiles() {
        return service.getAllProfiles();
    }

    @GetMapping("/profile/{id}")
    public Profile getProfile(@PathVariable Long id) {
        return service.getProfileById(id);
    }

    @PostMapping("/profile")
    public Profile createProfile(@RequestBody Profile profile) {
        return service.createProfile(profile);
    }
}