package com.github.g1335333249.common.configure;

import com.github.g1335333249.common.handler.AuthAccessDeniedHandler;
import com.github.g1335333249.common.handler.AuthExceptionEntryPoint;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;

/**
 * @author guanpeng
 * @description TODO
 * @date 2021/3/19 10:45 上午
 * @since
 */
public class AuthExceptionConfigure {
    @Bean
    @ConditionalOnMissingBean(name = "accessDeniedHandler")
    public AuthAccessDeniedHandler accessDeniedHandler() {
        return new AuthAccessDeniedHandler();
    }

    @Bean
    @ConditionalOnMissingBean(name = "authenticationEntryPoint")
    public AuthExceptionEntryPoint authenticationEntryPoint() {
        return new AuthExceptionEntryPoint();
    }
}
