package com.ckws.portfolioservice.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "profile")
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "full_name", nullable = false, length = 255)
    private String fullName;

    @Column(nullable = false, length = 255)
    private String title;

    @Column(columnDefinition = "TEXT")
    private String summary;

    @Column(length = 255)
    private String email;

    @Column(length = 255)
    private String location;

    @Column(name = "years_of_experience")
    private Integer yearsOfExperience;

    @Column(length = 255)
    private String github;

    @Column(length = 255)
    private String linkedin;

    @Column(length = 255)
    private String website;
}