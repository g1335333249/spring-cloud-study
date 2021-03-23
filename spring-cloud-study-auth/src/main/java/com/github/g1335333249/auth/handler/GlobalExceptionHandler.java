package com.github.g1335333249.auth.handler;

import com.github.g1335333249.common.handler.BaseExceptionHandler;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author guanpeng
 * @description 全局异常处理
 * @date 2021/3/19 2:30 下午
 * @since
 */
@RestControllerAdvice
@Order(value = Ordered.HIGHEST_PRECEDENCE)
public class GlobalExceptionHandler extends BaseExceptionHandler {

}
