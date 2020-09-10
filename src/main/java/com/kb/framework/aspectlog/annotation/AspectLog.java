package com.kb.framework.aspectlog.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 用于注解需要打印执行时间的方法
 *
 * @author huangkaibin
 * @date 2020/9/9 0009
 * @version 1.0.0
 **/
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public@ interface AspectLog {
}