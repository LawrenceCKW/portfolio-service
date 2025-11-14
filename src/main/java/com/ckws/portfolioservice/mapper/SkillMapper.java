package com.ckws.portfolioservice.mapper;

import com.ckws.portfolioservice.domain.Skill;
import com.ckws.portfolioservice.dto.SkillResponseDto;

public final class SkillMapper {

    private SkillMapper() {}

    public static SkillResponseDto toDto(Skill s) {
        return new SkillResponseDto(
                s.getId(),
                s.getName(),
                s.getLevel(),
                s.getCategory(),
                s.getTags()
        );
    }
}