package com.github.g1335333249.resource.server;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

/**
 * @author guanpeng
 * @description TODO
 * @date 2021/3/17 5:04 下午
 * @since
 */
@SpringCloudApplication
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class ResourceServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ResourceServerApplication.class, args);
    }
}
