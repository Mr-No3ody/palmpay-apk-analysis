package org.checkerframework.checker.units.qual;

import Xg.a;
import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes4.dex */
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface UnitsMultiple {
    a prefix() default a.f11226b;

    Class<? extends Annotation> quantity();
}
