package com.wooshop.security.enums;

/**
 * 安全相关常量
 *
 * @author woo
 */
public enum SecurityEnum {

    /**
     * 存在与header中的token参数头 名
     */
    HEADER_TOKEN("accessToken"),
    USER_CONTEXT("userContext"),
    JWT_SECRET("secret");

    String value;

    SecurityEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
