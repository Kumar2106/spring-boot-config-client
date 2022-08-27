package com.example.configurable_spring_values.constant;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("experiment")
@Getter
@Setter
@RefreshScope
public class ExperimentConstant {
    @Value("aditya")
    String name;
}
