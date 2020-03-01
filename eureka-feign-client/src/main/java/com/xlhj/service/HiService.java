package com.xlhj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @Author: Liu Caijing
 * @Date: 2020/2/29 18:20
 * @Description: TODO
 * @Version: 0.0.1
 */
@Service
public class HiService {

    @Autowired
    EurekaClientFeign eurekaClientFeign;

    public String sayHi(String name) {
        return eurekaClientFeign.sayHiFromClientEureka(name);
    }
}
