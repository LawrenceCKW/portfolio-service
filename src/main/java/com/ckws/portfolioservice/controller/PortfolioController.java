package com.ckws.portfolioservice.controller;

import com.ckws.portfolioservice.common.ApiResponse;
import com.ckws.portfolioservice.dto.PortfolioResponseDto;
import com.ckws.portfolioservice.service.PortfolioService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/portfolio")
@RequiredArgsConstructor
public class PortfolioController {
    private final PortfolioService portfolioService;

    @GetMapping
    public ApiResponse<PortfolioResponseDto> getPortfolio() {
        Long profileId = 1L;
        return ApiResponse.ok(portfolioService.getPortfolio(profileId));
    }
}