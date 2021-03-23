package com.github.g1335333249.common.handler;

import com.github.g1335333249.common.entity.AuthResponse;
import com.github.g1335333249.common.exception.AuthException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author guanpeng
 * @description 基础异常处理
 * @date 2021/3/19 2:28 下午
 * @since
 */
@Slf4j
public class BaseExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public AuthResponse handleException(Exception e) {
        log.error("系统内部异常，异常信息", e);
        return new AuthResponse().message("系统内部异常");
    }

    @ExceptionHandler(value = AuthException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public AuthResponse handleFebsAuthException(AuthException e) {
        log.error("系统错误", e);
        return new AuthResponse().message(e.getMessage());
    }

    @ExceptionHandler(value = AccessDeniedException.class)
    @ResponseStatus(HttpStatus.FORBIDDEN)
    public AuthResponse handleAccessDeniedException() {
        return new AuthResponse().message("没有权限访问该资源");
    }
}
