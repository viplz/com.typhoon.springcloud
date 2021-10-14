package com.typhoon.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author lian-zhang
 * @version 1.0
 * @ClassName ResponseResult.java
 * @Description 请求结果响应类
 * @createTime 2021年09月30日 21:55:54
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseResult<T> {
    private Integer code;
    private String  message;
    private T       data;

    public ResponseResult(Integer code, String message) {
        this(code, message, null);
    }
}
