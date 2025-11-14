package com.ckws.portfolioservice.service.impl;

import com.ckws.portfolioservice.dto.ExperienceResponseDto;
import com.ckws.portfolioservice.mapper.ExperienceMapper;
import com.ckws.portfolioservice.repository.ExperienceRepository;
import com.ckws.portfolioservice.service.ExperienceService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ExperienceServiceImpl implements ExperienceService {
    private final ExperienceRepository repo;

    @Override
    public List<ExperienceResponseDto> listByProfileId(Long profileId) {
        return repo.findByProfile_IdOrderByStartDateDesc(profileId)
                .stream()
                .map(ExperienceMapper::toDto)
                .toList();
    }

    @Override
    public ExperienceResponseDto getOne(Long id) {
        var e = repo.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Experience not found: " + id));
        return ExperienceMapper.toDto(e);
    }
}