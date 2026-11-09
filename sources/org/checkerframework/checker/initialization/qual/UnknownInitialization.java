package org.checkerframework.checker.initialization.qual;

import Yg.c;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.checkerframework.framework.qual.DefaultFor;
import org.checkerframework.framework.qual.SubtypeOf;

/* JADX INFO: loaded from: classes4.dex */
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@DefaultFor({c.f11476a, c.f11477b})
@Documented
@Retention(RetentionPolicy.RUNTIME)
@SubtypeOf({})
public @interface UnknownInitialization {
    Class<?> value() default Object.class;
}
