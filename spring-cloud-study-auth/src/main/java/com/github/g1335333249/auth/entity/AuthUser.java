package com.github.g1335333249.auth.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author guanpeng
 * @description TODO
 * @date 2021/3/12 4:39 下午
 * @since
 */
@Data
public class AuthUser implements Serializable {
    private static final long serialVersionUID = -1L;

    private String username;

    private String password;

    private boolean accountNonExpired = true;

    private boolean accountNonLocked = true;

    private boolean credentialsNonExpired = true;

    private boolean enabled = true;
}
