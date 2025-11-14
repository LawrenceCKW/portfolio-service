package com.ckws.portfolioservice.dto;

import java.util.List;
import java.util.Map;

public record ProjectResponseDto(
        Long id,
        String title,
        String description,
        String githubUrl,
        String liveUrl,
        boolean featured,
        List<String> techStack,
        List<String> highlights,
        Map<String, Object> metadata
) {}
