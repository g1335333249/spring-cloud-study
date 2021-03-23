package com.github.g1335333249.resource.server;

import com.github.g1335333249.common.annotation.EnableAuthExceptionHandler;
import com.github.g1335333249.common.annotation.EnableOAuth2FeignClient;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

/**
 * @author guanpeng
 * @description TODO
 * @date 2021/3/17 5:04 下午
 * @since
 */
@SpringCloudApplication
@EnableGlobalMethodSecurity(prePostEnabled = true)
@EnableAuthExceptionHandler
@EnableFeignClients
@EnableOAuth2FeignClient
public class ResourceServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ResourceServerApplication.class, args);
    }
}
