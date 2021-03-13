package ru.vishnyakov.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class NumberService {
    private static final Logger logger = LoggerFactory.getLogger(NumberService.class);

    @Cacheable(value = "number", key = "#number")
    public BigDecimal square(Long number) {
        BigDecimal square = BigDecimal.valueOf(number)
                .multiply(BigDecimal.valueOf(number));
        logger.info("square of {} is {}", number, square);
        return square;
    }
}