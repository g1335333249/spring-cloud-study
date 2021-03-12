package com.github.g1335333249.common.exception;

/**
 * @author guanpeng
 * @description 权限异常
 * @date 2021/3/12 5:22 下午
 * @since
 */
public class AuthException extends Exception{

    private static final long serialVersionUID = -6916154462432027437L;

    public AuthException(String message){
        super(message);
    }
}