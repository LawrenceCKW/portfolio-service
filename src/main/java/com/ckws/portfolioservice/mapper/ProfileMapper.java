package com.ckws.portfolioservice.mapper;

import com.ckws.portfolioservice.domain.Profile;
import com.ckws.portfolioservice.dto.ProfileResponseDto;

public final class ProfileMapper {
    private ProfileMapper() {}

    public static ProfileResponseDto toDto(Profile p) {
        return new ProfileResponseDto(
                p.getId(),
                p.getFullName(),
                p.getTitle(),
                p.getSummary(),
                p.getEmail(),
                p.getLocation(),
                p.getYearsOfExperience(),
                p.getGithub(),
                p.getLinkedin(),
                p.getWebsite()
        );
    }
}