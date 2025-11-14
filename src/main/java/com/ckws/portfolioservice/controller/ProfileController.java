package com.ckws.portfolioservice.controller;

import com.ckws.portfolioservice.common.ApiResponse;
import com.ckws.portfolioservice.dto.ProfileResponseDto;
import com.ckws.portfolioservice.service.ProfileService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/profile")
@RequiredArgsConstructor
public class ProfileController {
    private final ProfileService service;

    @GetMapping
    public ApiResponse<ProfileResponseDto> getDefault() {
        return ApiResponse.ok(service.getDefaultProfile());
    }

    @GetMapping("/{id}")
    public ApiResponse<ProfileResponseDto> getById(@PathVariable Long id) {
        return ApiResponse.ok(service.getById(id));
    }
}