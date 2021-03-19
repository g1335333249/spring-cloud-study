package com.github.g1335333249.common.handler;

import com.github.g1335333249.common.entity.AuthResponse;
import com.github.g1335333249.common.utils.AuthUtil;
import org.springframework.http.MediaType;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author guanpeng
 * @description 无权访问
 * @date 2021/3/19 10:42 上午
 * @since
 */
public class AuthAccessDeniedHandler implements AccessDeniedHandler {
    @Override
    public void handle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AccessDeniedException e) throws IOException, ServletException {
        AuthResponse authResponse = new AuthResponse();
        AuthUtil.makeResponse(
                httpServletResponse, MediaType.APPLICATION_JSON_VALUE,
                HttpServletResponse.SC_FORBIDDEN, authResponse.message("没有权限访问该资源"));

    }
}
