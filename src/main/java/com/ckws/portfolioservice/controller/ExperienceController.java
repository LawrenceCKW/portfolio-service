package com.ckws.portfolioservice.controller;

import com.ckws.portfolioservice.common.ApiResponse;
import com.ckws.portfolioservice.dto.ExperienceResponseDto;
import com.ckws.portfolioservice.service.ExperienceService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/experiences")
@RequiredArgsConstructor
public class ExperienceController {

    private final ExperienceService service;

    @GetMapping
    public ApiResponse<List<ExperienceResponseDto>> list() {
        Long profileId = 1L;
        return ApiResponse.ok(service.listByProfileId(profileId));
    }

    @GetMapping("/{id}")
    public ApiResponse<ExperienceResponseDto> getOne(@PathVariable Long id) {
        return ApiResponse.ok(service.getOne(id));
    }
}