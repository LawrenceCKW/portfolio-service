package com.ckws.portfolioservice.service;

import com.ckws.portfolioservice.dto.SkillResponseDto;

import java.util.List;

public interface SkillService {
    List<SkillResponseDto> listByProfileId(Long profileId);
    SkillResponseDto getOne(Long id);
}