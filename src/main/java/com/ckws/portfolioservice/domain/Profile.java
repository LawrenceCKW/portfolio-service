//package com.ckws.portfolioservice.domain;
//
//import jakarta.persistence.*;
//import lombok.*;
//
//@Entity
//@Getter @Setter
//@NoArgsConstructor
//@AllArgsConstructor
//@Builder
//@Table(name = "profile")
//public class Profile {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @Column(nullable = false)
//    private String fullName;
//
//    @Column(nullable = false)
//    private String title;
//
//    @Column(columnDefinition = "TEXT")
//    private String summary;
//
//    private String email;
//    private String location;
//
//    @Column(name = "years_of_experience")
//    private Integer yearsOfExperience;
//
//    private String github;
//    private String linkedin;
//    private String website;
//}
