package com.yupi.oj.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

@Data
@ConfigurationProperties(prefix = "sakura.auth")
public class AuthConfig {
    private List<String> includePaths;
    private List<String> excludePaths;
}
