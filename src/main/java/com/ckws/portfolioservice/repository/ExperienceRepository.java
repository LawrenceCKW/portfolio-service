package com.ckws.portfolioservice.repository;

import com.ckws.portfolioservice.domain.Experience;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExperienceRepository extends JpaRepository<Experience, Long> {
    List<Experience> findByProfile_IdOrderByStartDateDesc(Long profileId);
}