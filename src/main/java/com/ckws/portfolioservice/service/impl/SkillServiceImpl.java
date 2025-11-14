package com.ckws.portfolioservice.service.impl;

import com.ckws.portfolioservice.dto.SkillResponseDto;
import com.ckws.portfolioservice.mapper.SkillMapper;
import com.ckws.portfolioservice.repository.SkillRepository;
import com.ckws.portfolioservice.service.SkillService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SkillServiceImpl implements SkillService {

    private final SkillRepository repo;

    @Override
    public List<SkillResponseDto> listByProfileId(Long profileId) {
        return repo.findByProfile_IdOrderByCategoryAscNameAsc(profileId)
                .stream()
                .map(SkillMapper::toDto)
                .toList();
    }

    @Override
    public SkillResponseDto getOne(Long id) {
        var s = repo.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Skill not found: " + id));
        return SkillMapper.toDto(s);
    }
}