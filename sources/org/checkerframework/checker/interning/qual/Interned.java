package org.checkerframework.checker.interning.qual;

import Yg.a;
import Yg.b;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.checkerframework.framework.qual.DefaultFor;
import org.checkerframework.framework.qual.QualifierForLiterals;
import org.checkerframework.framework.qual.SubtypeOf;

/* JADX INFO: loaded from: classes4.dex */
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@QualifierForLiterals({a.f11464j, a.f11463i})
@DefaultFor(typeKinds = {b.f11466a, b.f11467b, b.f11471f, b.f11473i, b.f11472g, b.f11469d, b.f11470e, b.f11468c})
@Documented
@Retention(RetentionPolicy.RUNTIME)
@SubtypeOf({UnknownInterned.class})
public @interface Interned {
}
