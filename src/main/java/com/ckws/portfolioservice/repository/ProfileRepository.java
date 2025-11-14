package com.ckws.portfolioservice.repository;

import com.ckws.portfolioservice.domain.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository extends JpaRepository<Profile, Long> {
}
