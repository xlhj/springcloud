package com.xlhj.controller;

import com.xlhj.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Liu Caijing
 * @Date: 2020/2/29 17:34
 * @Description: TODO
 * @Version: 0.0.1
 */
@RestController
public class RibbonController {

    @Autowired
    RibbonService ribbonService;
    @Autowired
    LoadBalancerClient loadBalancer;

    @GetMapping("/hi")
    public String hi(@RequestParam(required = false, defaultValue = "forezp") String name) {
        return ribbonService.hi(name);
    }

    @GetMapping("/testRibbon")
    public String testRibbon() {
        ServiceInstance instance = loadBalancer.choose("eureka-client");
        return instance.getHost() + ":" + instance.getPort();
    }
}
