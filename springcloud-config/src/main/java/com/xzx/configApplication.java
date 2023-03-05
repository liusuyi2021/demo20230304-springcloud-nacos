package com.xzx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName configApplication
 * @Description:
 * @Author 刘苏义
 * @Date 2023/3/5 10:21
 * @Version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class configApplication {
    public static void main(String[] args) {
        SpringApplication.run(configApplication.class);
    }
}
