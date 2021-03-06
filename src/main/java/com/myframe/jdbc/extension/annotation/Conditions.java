package com.myframe.jdbc.extension.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author lch
 * @since 2019-03-22
 */
@Target({METHOD})
@Retention(RUNTIME)
public @interface Conditions {


    /**
     * must be unique
     */
    String name() default "";

    Condition[] value() default {};

}
