package com.ckws.portfolioservice.dto;

import java.util.List;

public record PortfolioResponseDto(
        ProfileResponseDto profile,
        List<ExperienceResponseDto> experiences,
        List<ProjectResponseDto> projects,
        List<SkillResponseDto> skills
) {}