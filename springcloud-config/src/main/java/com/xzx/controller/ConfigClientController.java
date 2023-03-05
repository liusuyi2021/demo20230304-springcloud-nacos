package com.xzx.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName ConfigClientController
 * @Description:
 * @Author 刘苏义
 * @Date 2023/3/5 10:47
 * @Version 1.0
 */

@RestController
@RefreshScope
public class ConfigClientController {
    @Value("${config.info}")
    private String ConfigInfo;

    @GetMapping("/config/info")
    public String getConfigInfo() {
        return ConfigInfo;
    }
}
