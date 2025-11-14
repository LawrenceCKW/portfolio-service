package com.ckws.portfolioservice.dto;

import java.util.List;

public record SkillResponseDto(
        Long id,
        String name,
        String level,
        String category,
        List<String> tags
) {}