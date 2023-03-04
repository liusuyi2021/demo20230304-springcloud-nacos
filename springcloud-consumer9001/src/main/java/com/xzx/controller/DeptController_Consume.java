package com.xzx.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @ClassName: testController
 * @Description:
 * @Author: Administrator
 * @Date: 2023年03月04日 15:56
 * @Version: 1.0
 **/
@RestController
public class DeptController_Consume {
    @Resource
    RestTemplate restTemplate;
    @Value("${service-url.nacos-user-service}")
    private String serverURL; //服务提供者的服务名
    @GetMapping("/consumer/dept/nacos/{id}")
    String test(@PathVariable("id") Long id)
    {
        String forObject = restTemplate.getForObject(serverURL+"/dept/nacos/"+id, String.class);
        return  forObject;
    }
}
