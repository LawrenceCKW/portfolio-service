package com.ckws.portfolioservice.mapper;

import com.ckws.portfolioservice.domain.Experience;
import com.ckws.portfolioservice.dto.ExperienceResponseDto;

public final class ExperienceMapper {
    private ExperienceMapper() {}

    public static ExperienceResponseDto toDto(Experience e) {
        return new ExperienceResponseDto(
                e.getId(),
                e.getCompany(),
                e.getPosition(),
                e.getLocation(),
                e.getStartDate(),
                e.getEndDate(),
                e.isCurrent(),
                e.getResponsibilities(),
                e.getTechStack()
        );
    }
}