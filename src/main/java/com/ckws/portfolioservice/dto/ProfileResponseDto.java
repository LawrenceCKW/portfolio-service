package com.ckws.portfolioservice.dto;

public record ProfileResponseDto(
        Long id,
        String fullName,
        String title,
        String summary,
        String email,
        String location,
        Integer yearsOfExperience,
        String github,
        String linkedin,
        String website
) {}