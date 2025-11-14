package com.ckws.portfolioservice.repository;

import com.ckws.portfolioservice.domain.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SkillRepository extends JpaRepository<Skill, Long> {
    List<Skill> findByProfile_IdOrderByCategoryAscNameAsc(Long profileId);
}