package com.xlhj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author: Liu Caijing
 * @Date: 2020/2/29 18:14
 * @Description: TODO
 * @Version: 0.0.1
 */
@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
@EnableHystrixDashboard
@EnableHystrix
public class EurekaFeignClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaFeignClientApplication.class, args);
    }
}
