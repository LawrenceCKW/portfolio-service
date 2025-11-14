package com.ckws.portfolioservice.service.impl;

import com.ckws.portfolioservice.dto.*;
import com.ckws.portfolioservice.service.*;
import lombok.RequiredArgsConstructor;
import org.springframework.core.task.TaskExecutor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@Service
@RequiredArgsConstructor
public class PortfolioServiceImpl implements PortfolioService {

    private final ProfileService profileService;
    private final ExperienceService experienceService;
    private final ProjectService projectService;
    private final SkillService skillService;
    private final TaskExecutor portfolioExecutor;

    @Override
    public PortfolioResponseDto getPortfolio(Long profileId) {
        ProfileResponseDto profile = profileService.getById(profileId);

        CompletableFuture<List<ExperienceResponseDto>> experienceFuture =
                CompletableFuture.supplyAsync(
                        () -> experienceService.listByProfileId(profileId),
                        portfolioExecutor);

        CompletableFuture<List<ProjectResponseDto>> projectFuture =
                CompletableFuture.supplyAsync(
                        () -> projectService.listByProfileId(profileId),
                        portfolioExecutor);

        CompletableFuture<List<SkillResponseDto>> skillFuture =
                CompletableFuture.supplyAsync(
                        () -> skillService.listByProfileId(profileId),
                        portfolioExecutor);

        CompletableFuture.allOf(experienceFuture, projectFuture, skillFuture).join();

        return new PortfolioResponseDto(
                profile, experienceFuture.join(), projectFuture.join(), skillFuture.join());
    }
}