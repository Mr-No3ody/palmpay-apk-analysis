package com.alibaba.android.arouter.facade.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.CLASS)
public @interface Route {
    String deeplink() default "";

    int extras() default Integer.MIN_VALUE;

    String group() default "";

    String image() default "";

    String name() default "";

    String path();

    int priority() default -1;

    String remark() default "";
}
