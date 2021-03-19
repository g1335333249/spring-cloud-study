package com.github.g1335333249.auth.configure;

import com.github.g1335333249.common.handler.AuthAccessDeniedHandler;
import com.github.g1335333249.common.handler.AuthExceptionEntryPoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;

/**
 * @author guanpeng
 * @description 资源服务器配置
 * @date 2021/3/12 4:17 下午
 * @since
 */
@Configuration
@EnableResourceServer
public class AuthResourceServerConfigure extends ResourceServerConfigurerAdapter {
    @Autowired
    private AuthAccessDeniedHandler accessDeniedHandler;
    @Autowired
    private AuthExceptionEntryPoint exceptionEntryPoint;

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .requestMatchers().antMatchers("/**")
                .and()
                .authorizeRequests()
                .antMatchers("/**").authenticated();
    }

    @Override
    public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
        resources.authenticationEntryPoint(exceptionEntryPoint)
                .accessDeniedHandler(accessDeniedHandler);
    }
}
