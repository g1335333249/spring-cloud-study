package com.github.g1335333249.common.annotation;

import com.github.g1335333249.common.configure.AuthExceptionConfigure;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author guanpeng
 * @description TODO
 * @date 2021/3/19 10:47 上午
 * @since
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(AuthExceptionConfigure.class)
public @interface EnableAuthExceptionHandler {
}
