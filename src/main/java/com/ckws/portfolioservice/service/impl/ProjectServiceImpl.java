package com.ckws.portfolioservice.service.impl;

import com.ckws.portfolioservice.dto.ProjectResponseDto;
import com.ckws.portfolioservice.mapper.ProjectMapper;
import com.ckws.portfolioservice.repository.ProjectRepository;
import com.ckws.portfolioservice.service.ProjectService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProjectServiceImpl implements ProjectService {

    private final ProjectRepository repo;

    @Override
    public List<ProjectResponseDto> listByProfileId(Long profileId) {
        return repo.findByProfile_IdOrderByFeaturedDescTitleAsc(profileId)
                .stream()
                .map(ProjectMapper::toDto)
                .toList();
    }

    @Override
    public ProjectResponseDto getOne(Long id) {
        var project = repo.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Project not found: " + id));
        return ProjectMapper.toDto(project);
    }
}
