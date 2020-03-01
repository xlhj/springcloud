package com.xlhj.service;

import org.springframework.stereotype.Component;

/**
 * @Author: Liu Caijing
 * @Date: 2020/2/29 19:57
 * @Description: TODO
 * @Version: 0.0.1
 */
@Component
public class HiHystrix implements EurekaClientFeign {

    @Override
    public String sayHiFromClientEureka(String name) {
        return "hi," + name + ",sorry,error!";
    }
}
