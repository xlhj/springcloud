package com.xlhj.springcloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Liu Caijing
 * @Date: 2020/2/29 16:19
 * @Description: TODO
 * @Version: 0.0.1
 */
@RestController
public class HiController {
    @Value("${server.port}")
    String port;

    @GetMapping("/hi")
    public String home(@RequestParam String name) {
        return "hi " + name + ",i am from port:" + port;
    }
}
