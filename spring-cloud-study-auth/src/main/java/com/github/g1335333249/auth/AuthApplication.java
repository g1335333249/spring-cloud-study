package com.github.g1335333249.auth;

import com.github.g1335333249.common.annotation.EnableAuthExceptionHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * @author guanpeng
 * @description TODO
 * @date 2021/3/12 10:07 上午
 * @since
 */
@SpringCloudApplication
@EnableAuthExceptionHandler
public class AuthApplication {
    public static void main(String[] args) {
        SpringApplication.run(AuthApplication.class, args);
    }
}
