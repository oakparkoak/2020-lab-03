package com.xlaser.junit.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.junit.jupiter.api.Tag;

/**
 * @package: com.xlaser.junit.annotation
 * @author: Elijah.D
 * @time: 2019/11/29 10:44
 * @description: 测试自定义注解绑定tag, mvn中配置filter
 * @copyright: Copyright(c) 2019
 * @version: V1.0
 * @modified: Elijah.D
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Tag("non-functional")
@Tag("usability")
public @interface Usability {
}
