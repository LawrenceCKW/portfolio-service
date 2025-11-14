package com.ckws.portfolioservice.controller;

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

    // For now, default to profileId = 1
    @GetMapping
    public List<ProjectResponseDto> list() {
        Long profileId = 1L;
        return service.listByProfileId(profileId);
    }

    @GetMapping("/{id}")
    public ProjectResponseDto getOne(@PathVariable Long id) {
        return service.getOne(id);
    }
}