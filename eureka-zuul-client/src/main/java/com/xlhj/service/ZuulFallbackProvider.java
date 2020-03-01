package com.xlhj.service;

import org.springframework.http.client.ClientHttpResponse;

/**
 * @Author: Liu Caijing
 * @Date: 2020/2/29 22:04
 * @Description: TODO
 * @Version: 0.0.1
 */
public interface ZuulFallbackProvider {
    public String getRoute();
    public ClientHttpResponse fallbackResponse();
}
