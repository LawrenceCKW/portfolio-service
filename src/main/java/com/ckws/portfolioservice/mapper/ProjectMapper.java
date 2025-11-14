package com.ckws.portfolioservice.mapper;

import com.ckws.portfolioservice.domain.Project;
import com.ckws.portfolioservice.dto.ProjectResponseDto;

public final class ProjectMapper {
    private ProjectMapper() {}

    public static ProjectResponseDto toDto(Project p) {
        return new ProjectResponseDto(
                p.getId(),
                p.getTitle(),
                p.getDescription(),
                p.getGithubUrl(),
                p.getLiveUrl(),
                p.isFeatured(),
                p.getTechStack(),
                p.getHighlights(),
                p.getMetadata()
        );
    }
}