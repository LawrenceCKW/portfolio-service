package com.ckws.portfolioservice.controller;

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
    public PortfolioResponseDto getPortfolio() {
        Long profileId = 1L;
        return portfolioService.getPortfolio(profileId);
    }
}