package com.example.Nghi.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Getter
@Setter
@Table(name = "profile")
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int age;
    private String job;
    private String email;
    private String phone;
    private String address;

    private String university;
    private String major;

    @Column(length = 1000)
    private String bio;

    private String skills;
    private String github;
    private String linkedin;
}