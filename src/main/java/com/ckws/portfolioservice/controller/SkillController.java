package com.ckws.portfolioservice.controller;

import com.ckws.portfolioservice.common.ApiResponse;
import com.ckws.portfolioservice.dto.SkillResponseDto;
import com.ckws.portfolioservice.service.SkillService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/skills")
@RequiredArgsConstructor
public class SkillController {
    private final SkillService service;

    @GetMapping
    public ApiResponse<List<SkillResponseDto>> list() {
        Long profileId = 1L;
        return ApiResponse.ok(service.listByProfileId(profileId));
    }

    @GetMapping("/{id}")
    public ApiResponse<SkillResponseDto> getOne(@PathVariable Long id) {
        return ApiResponse.ok(service.getOne(id));
    }
}