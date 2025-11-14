package com.ckws.portfolioservice.controller;

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
    public ProfileResponseDto getDefault() {
        return service.getDefaultProfile();
    }

    @GetMapping("/{id}")
    public ProfileResponseDto getById(@PathVariable Long id) {
        return service.getById(id);
    }
}