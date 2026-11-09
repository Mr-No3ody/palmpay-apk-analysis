package org.checkerframework.checker.units.qual;

import Xg.a;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.checkerframework.framework.qual.SubtypeOf;

/* JADX INFO: loaded from: classes4.dex */
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@UnitsMultiple(prefix = a.f11225a, quantity = m.class)
@Documented
@Retention(RetentionPolicy.RUNTIME)
@SubtypeOf({Length.class})
public @interface km {
}
