package org.checkerframework.checker.lock.qual;

import Yg.c;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.checkerframework.framework.qual.SubtypeOf;
import org.checkerframework.framework.qual.TargetLocations;

/* JADX INFO: loaded from: classes4.dex */
@Target({ElementType.TYPE_USE})
@TargetLocations({c.f11479d, c.f11480e, c.f11481f})
@Documented
@Retention(RetentionPolicy.RUNTIME)
@SubtypeOf({GuardedByUnknown.class})
public @interface GuardSatisfied {
    int value() default -1;
}
