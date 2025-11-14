package com.ckws.portfolioservice.service;

import com.ckws.portfolioservice.dto.ExperienceResponseDto;

import java.util.List;

public interface ExperienceService {
    List<ExperienceResponseDto> listByProfileId(Long profileId);
    ExperienceResponseDto getOne(Long id);
}