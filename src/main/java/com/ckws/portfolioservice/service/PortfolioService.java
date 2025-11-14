package com.ckws.portfolioservice.service;

import com.ckws.portfolioservice.dto.PortfolioResponseDto;

public interface PortfolioService {
    PortfolioResponseDto getPortfolio(Long profileId);
}