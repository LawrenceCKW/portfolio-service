package com.ckws.portfolioservice.service.impl;


import com.ckws.portfolioservice.dto.ProfileResponseDto;
import com.ckws.portfolioservice.mapper.ProfileMapper;
import com.ckws.portfolioservice.repository.ProfileRepository;
import com.ckws.portfolioservice.service.ProfileService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProfileServiceImpl implements ProfileService {

    private final ProfileRepository repo;

    @Override
    public ProfileResponseDto getDefaultProfile() {
        var profile = repo.findAll().stream()
                .findFirst()
                .orElseThrow(() -> new EntityNotFoundException("No profile found"));
        return ProfileMapper.toDto(profile);
    }

    @Override
    public ProfileResponseDto getById(Long id) {
        var profile = repo.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Profile not found: " + id));
        return ProfileMapper.toDto(profile);
    }
}