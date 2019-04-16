package com.samlai.cloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ Author     ：SamLai
 * @ Date       ：Created in 2019-04-16 18:08
 * @ Description：
 */
@RestController
@Slf4j
public class DataIdController {


    @Value("${profile:}")
    private String profile;

    @GetMapping("/dataId/test")
    public String hello() {
        log.info("profile :  {}", profile);
        return profile;
    }
}
