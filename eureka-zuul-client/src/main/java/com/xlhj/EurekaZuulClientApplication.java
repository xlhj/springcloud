package com.xlhj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Author: Liu Caijing
 * @Date: 2020/2/29 21:20
 * @Description: TODO
 * @Version: 0.0.1
 */
@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class EurekaZuulClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaZuulClientApplication.class, args);
    }
}
