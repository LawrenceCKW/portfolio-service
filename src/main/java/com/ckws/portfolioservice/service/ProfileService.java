package com.ckws.portfolioservice.service;

import com.ckws.portfolioservice.dto.ProfileResponseDto;

public interface ProfileService {
    ProfileResponseDto getDefaultProfile();
    ProfileResponseDto getById(Long id);
}
