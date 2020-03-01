package com.xlhj.controller;

import com.xlhj.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Liu Caijing
 * @Date: 2020/2/29 18:22
 * @Description: TODO
 * @Version: 0.0.1
 */
@RestController
public class HiController {

    @Autowired
    HiService hiService;

    @GetMapping("/hi")
    public String sayHi(@RequestParam(defaultValue = "forezp", required = false) String name) {
        return hiService.sayHi(name);
    }
}
