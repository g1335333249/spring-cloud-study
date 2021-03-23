package com.github.g1335333249.resource.server.controller;

import com.github.g1335333249.resource.server.feign.api.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * @author guanpeng
 * @description 权限测试
 * @date 2021/3/17 5:10 下午
 * @since
 */
@RestController
public class TestController {
    @GetMapping("info")
    public String test() {
        return "resource-server";
    }

    @GetMapping("test1")
    @PreAuthorize("hasAnyAuthority('user:add')")
    public String test1() {
        return "拥有'user:add'权限";
    }

    @GetMapping("test2")
    @PreAuthorize("hasAnyAuthority('user:update')")
    public String test2() {
        return "拥有'user:update'权限";
    }

    @GetMapping("user")
    public Principal currentUser(Principal principal) {
        return principal;
    }

    @Autowired
    private TestService testService;

    @GetMapping("testService")
    public String testService(String message) {
        return testService.hello(message);
    }
}
