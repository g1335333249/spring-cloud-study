package com.github.g1335333249.common.entity;

import java.util.HashMap;

/**
 * @author guanpeng
 * @description 通用返回
 * @date 2021/3/12 5:19 下午
 * @since
 */
public class AuthResponse extends HashMap<String, Object> {

    private static final long serialVersionUID = -8713837118340960775L;

    public AuthResponse message(String message) {
        this.put("message", message);
        return this;
    }

    public AuthResponse data(Object data) {
        this.put("data", data);
        return this;
    }

    @Override
    public AuthResponse put(String key, Object value) {
        super.put(key, value);
        return this;
    }

    public String getMessage() {
        return String.valueOf(get("message"));
    }

    public Object getData() {
        return get("data");
    }
}
