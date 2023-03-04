package com.xzx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName: product8001Application
 * @Description:
 * @Author: Administrator
 * @Date: 2023年03月04日 15:30
 * @Version: 1.0
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class product8003Application {
    public static void main(String[] args) {
        SpringApplication.run(product8003Application.class);
    }
}
