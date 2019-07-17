package com.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class VaultConfigClientApplication {

    @Value("${source.vault}")
    private String vaultsource;

    @Value("${source.git}")
    private String gitsource;

    @GetMapping(value = "/vault")
    public String getVaultprop(){
        return vaultsource;
    }

    @GetMapping(value = "/git")
    public String getGitprop(){
        return gitsource;
    }

    public static void main(String[] args) {
        SpringApplication.run(VaultConfigClientApplication.class, args);
    }

}