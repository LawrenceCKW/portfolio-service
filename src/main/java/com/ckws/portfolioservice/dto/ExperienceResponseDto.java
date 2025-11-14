package com.ckws.portfolioservice.dto;

import java.time.LocalDate;
import java.util.List;

public record ExperienceResponseDto(
        Long id,
        String company,
        String position,
        String location,
        LocalDate startDate,
        LocalDate endDate,
        boolean current,
        List<String> responsibilities,
        List<String> techStack
) {}