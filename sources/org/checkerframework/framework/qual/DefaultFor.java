package org.checkerframework.framework.qual;

import Yg.b;
import Yg.c;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes4.dex */
@Target({ElementType.ANNOTATION_TYPE})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface DefaultFor {
    String[] names() default {};

    String[] namesExceptions() default {};

    b[] typeKinds() default {};

    Class<?>[] types() default {};

    c[] value() default {};
}
