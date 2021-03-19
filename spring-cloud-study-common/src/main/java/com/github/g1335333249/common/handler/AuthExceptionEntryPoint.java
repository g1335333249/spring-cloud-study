package com.github.g1335333249.common.handler;

import com.alibaba.fastjson.JSONObject;
import com.github.g1335333249.common.entity.AuthResponse;
import com.github.g1335333249.common.utils.AuthUtil;
import org.springframework.http.MediaType;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author guanpeng
 * @description 未认证
 * @date 2021/3/19 10:36 上午
 * @since
 */
public class AuthExceptionEntryPoint implements AuthenticationEntryPoint {
    @Override
    public void commence(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AuthenticationException e) throws IOException, ServletException {
        AuthResponse authResponse = new AuthResponse();
        AuthUtil.makeResponse(
                httpServletResponse, MediaType.APPLICATION_JSON_VALUE,
                HttpServletResponse.SC_UNAUTHORIZED, authResponse.message("token无效")
        );
    }
}
