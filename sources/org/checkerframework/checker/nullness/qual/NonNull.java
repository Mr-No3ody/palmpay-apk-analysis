package org.checkerframework.checker.nullness.qual;

import Yg.a;
import Yg.b;
import Yg.c;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.checkerframework.framework.qual.DefaultFor;
import org.checkerframework.framework.qual.DefaultQualifierInHierarchy;
import org.checkerframework.framework.qual.QualifierForLiterals;
import org.checkerframework.framework.qual.SubtypeOf;
import org.checkerframework.framework.qual.UpperBoundFor;

/* JADX INFO: loaded from: classes4.dex */
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@QualifierForLiterals({a.f11463i})
@Retention(RetentionPolicy.RUNTIME)
@SubtypeOf({MonotonicNonNull.class})
@DefaultFor({c.f11478c})
@Documented
@UpperBoundFor(typeKinds = {b.f11474j, b.f11469d, b.f11466a, b.f11471f, b.f11473i, b.f11472g, b.f11470e, b.f11468c, b.f11467b})
@DefaultQualifierInHierarchy
public @interface NonNull {
}
