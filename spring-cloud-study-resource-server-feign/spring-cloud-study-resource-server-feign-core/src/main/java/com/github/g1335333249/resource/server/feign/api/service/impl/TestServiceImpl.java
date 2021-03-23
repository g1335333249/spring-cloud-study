package com.github.g1335333249.resource.server.feign.api.service.impl;

import com.github.g1335333249.resource.server.feign.api.service.TestService;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author guanpeng
 * @description TODO
 * @date 2021/3/19 3:43 下午
 * @since
 */
@RestController
public class TestServiceImpl implements TestService {
    @Override
    public String hello(String message) {
        return message;
    }
}
