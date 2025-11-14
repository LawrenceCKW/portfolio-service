package com.ckws.portfolioservice.controller;

import com.ckws.portfolioservice.common.ApiResponse;
import com.ckws.portfolioservice.dto.ProjectResponseDto;
import com.ckws.portfolioservice.service.ProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/projects")
@RequiredArgsConstructor
public class ProjectController {
    private final ProjectService service;

    @GetMapping
    public ApiResponse<List<ProjectResponseDto>> list() {
        Long profileId = 1L;
        return ApiResponse.ok(service.listByProfileId(profileId));
    }

    @GetMapping("/{id}")
    public ApiResponse<ProjectResponseDto> getOne(@PathVariable Long id) {
        return ApiResponse.ok(service.getOne(id));
    }
}