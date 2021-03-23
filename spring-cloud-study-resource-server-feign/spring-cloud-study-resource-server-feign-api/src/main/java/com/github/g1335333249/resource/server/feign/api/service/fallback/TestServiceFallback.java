package com.github.g1335333249.resource.server.feign.api.service.fallback;

import com.github.g1335333249.common.constants.ServiceConstants;
import com.github.g1335333249.resource.server.feign.api.service.TestService;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author guanpeng
 * @description TODO
 * @date 2021/3/19 3:31 下午
 * @since
 */
@Component
@Slf4j
public class TestServiceFallback implements FallbackFactory<TestService> {
    @Override
    public TestService create(Throwable throwable) {
        return message -> {
            log.error("调用[" + ServiceConstants.RESOURCE_SERVER_FEIGN + "]服务出错", throwable);
            return "调用[" + ServiceConstants.RESOURCE_SERVER_FEIGN + "]服务出错";
        };
    }
}
