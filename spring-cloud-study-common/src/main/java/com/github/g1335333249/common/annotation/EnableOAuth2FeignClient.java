package com.github.g1335333249.common.annotation;

import com.github.g1335333249.common.configure.OAuth2FeignConfigure;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author guanpeng
 * @description 开启Feign支持OAuth2的注解
 * @date 2021/3/19 3:48 下午
 * @since
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(OAuth2FeignConfigure.class)
public @interface EnableOAuth2FeignClient {
}
