package org.checkerframework.checker.lock.qual;

import Yg.b;
import Yg.c;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.checkerframework.framework.qual.DefaultFor;
import org.checkerframework.framework.qual.DefaultQualifierInHierarchy;
import org.checkerframework.framework.qual.JavaExpression;
import org.checkerframework.framework.qual.SubtypeOf;
import org.checkerframework.framework.qual.UpperBoundFor;

/* JADX INFO: loaded from: classes4.dex */
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@SubtypeOf({GuardedByUnknown.class})
@DefaultFor(typeKinds = {b.f11466a, b.f11467b, b.f11471f, b.f11473i, b.f11472g, b.f11469d, b.f11470e, b.f11468c}, types = {String.class, Void.class}, value = {c.f11478c, c.f11485o})
@Documented
@UpperBoundFor(typeKinds = {b.f11466a, b.f11467b, b.f11471f, b.f11473i, b.f11472g, b.f11469d, b.f11470e, b.f11468c}, types = {String.class})
@DefaultQualifierInHierarchy
public @interface GuardedBy {
    @JavaExpression
    String[] value() default {};
}
