package com.ckws.portfolioservice.repository;

import com.ckws.portfolioservice.domain.Project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProjectRepository extends JpaRepository<Project, Long> {
    List<Project> findByProfile_IdOrderByFeaturedDescTitleAsc(Long profileId);
}