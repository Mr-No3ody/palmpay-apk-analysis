package org.checkerframework.checker.signedness.qual;

import Yg.b;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.checkerframework.framework.qual.DefaultFor;
import org.checkerframework.framework.qual.SubtypeOf;
import org.checkerframework.framework.qual.UpperBoundFor;

/* JADX INFO: loaded from: classes4.dex */
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@DefaultFor(typeKinds = {b.f11467b, b.f11469d, b.f11470e, b.f11468c, b.f11472g, b.f11473i}, types = {Byte.class, Integer.class, Long.class, Short.class, Float.class, Double.class})
@Documented
@Retention(RetentionPolicy.RUNTIME)
@SubtypeOf({UnknownSignedness.class})
@UpperBoundFor(typeKinds = {b.f11472g, b.f11473i}, types = {Float.class, Double.class})
public @interface Signed {
}
