package com.github.g1335333249.resource.server.feign.api.service;

import com.github.g1335333249.common.constants.ServiceConstants;
import com.github.g1335333249.resource.server.feign.api.service.fallback.TestServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author guanpeng
 * @description TODO
 * @date 2021/3/19 3:27 下午
 * @since
 */
@FeignClient(value = ServiceConstants.RESOURCE_SERVER_FEIGN, contextId = "testService", fallbackFactory = TestServiceFallback.class)
public interface TestService {
    @GetMapping(value = "hello")
    String hello(@RequestParam("message") String message);
}
