package com.xzx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import javax.swing.*;

/**
 * @ClassName: consumer9001Application
 * @Description:
 * @Author: Administrator
 * @Date: 2023年03月04日 15:52
 * @Version: 1.0
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class consumer9001Application {
    public static void main(String[] args) {
        SpringApplication.run(consumer9001Application.class);
    }
}
