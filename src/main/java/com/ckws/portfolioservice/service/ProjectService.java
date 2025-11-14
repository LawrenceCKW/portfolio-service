package com.ckws.portfolioservice.service;

import com.ckws.portfolioservice.dto.ProjectResponseDto;

import java.util.List;

public interface ProjectService {
    List<ProjectResponseDto> listByProfileId(Long profileId);
    ProjectResponseDto getOne(Long id);
}