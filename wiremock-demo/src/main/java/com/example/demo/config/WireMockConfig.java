package com.example.demo.config;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import lombok.Data;

@Configuration
@ConfigurationProperties(prefix = "wiremock-config")
@Data
@Profile("integration")
public class WireMockConfig {
    private List<WireMockProxy> proxies;

    public List<WireMockProxy> getProxies() {
        return proxies;
    }

    public void setProxies(List<WireMockProxy> proxies) {
        this.proxies = proxies;
    }

}