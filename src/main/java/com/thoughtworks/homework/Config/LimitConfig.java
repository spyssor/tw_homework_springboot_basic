package com.thoughtworks.homework.Config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;

@Data
@Configuration
@ConfigurationProperties(prefix = "limit")
public class LimitConfig {

    private BigDecimal minMoney;

    private BigDecimal maxMoney;

    private String description;
}
