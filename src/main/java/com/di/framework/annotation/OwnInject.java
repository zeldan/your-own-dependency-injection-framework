package com.di.framework.annotation;

import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Custom annotation on constructor to indicate to the framework to inject the proper implementation.
 *
 * @author zeldan
 *
 */
@Target({CONSTRUCTOR, FIELD})
@Retention(RUNTIME)
@Documented
public @interface OwnInject {
}