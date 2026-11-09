package com.growingio.android.sdk.track.utils;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes3.dex */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ObjectUtils$FieldToString {
    Class<?> clazz();

    String method();

    Class<?>[] parameterTypes() default {};
}
