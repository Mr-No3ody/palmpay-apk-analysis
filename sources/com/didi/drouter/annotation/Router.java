package com.didi.drouter.annotation;

import androidx.annotation.Keep;
import com.didi.drouter.router.IRouterInterceptor;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.TYPE})
@Keep
@Retention(RetentionPolicy.CLASS)
public @interface Router {
    boolean hold() default false;

    String host() default "";

    Class<? extends IRouterInterceptor>[] interceptor() default {};

    String[] interceptorName() default {};

    String path() default "";

    int priority() default 0;

    String scheme() default "";

    int thread() default 0;

    String uri() default "";
}
