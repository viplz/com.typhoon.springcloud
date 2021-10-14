package com.typhoon.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author lian-zhang
 * @version 1.0
 * @ClassName Payment.java
 * @Description 支付类
 * @createTime 2021年09月30日 21:52:10
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
    private Long id;
    private String serial;
}
