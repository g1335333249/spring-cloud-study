package com.github.g1335333249.resource.server.feign;

import com.github.g1335333249.common.annotation.EnableAuthExceptionHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author guanpeng
 * @description Feign资源服务器
 * @date 2021/3/19 3:24 下午
 * @since
 */
@SpringCloudApplication
@EnableFeignClients
@EnableAuthExceptionHandler
public class ResourceServerFeignApplication {
    public static void main(String[] args) {
        SpringApplication.run(ResourceServerFeignApplication.class, args);
    }
}
