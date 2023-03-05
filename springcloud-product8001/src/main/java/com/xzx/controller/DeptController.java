package com.xzx.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: DeptController
 * @Description:
 * @Author: Administrator
 * @Date: 2023年03月04日 15:41
 * @Version: 1.0
 **/
@RestController
@RefreshScope
public class DeptController {
    @Value("${server.port}")
    private String serverPort;
    @Value("${config.info}")
    private String info;
    @GetMapping(value = "/dept/nacos/{id}")
    public String getPayment(@PathVariable("id") Integer id) {
        return "<h2>服务"+info+"访问成功！</h2>服务名：spring-cloud-alibaba-provider<br /> 端口号： " + serverPort + "<br /> 传入的参数：" + id;
    }
}
