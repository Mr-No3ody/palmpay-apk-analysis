package org.checkerframework.checker.initialization.qual;

import Yg.c;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.checkerframework.framework.qual.DefaultFor;
import org.checkerframework.framework.qual.DefaultQualifierInHierarchy;
import org.checkerframework.framework.qual.SubtypeOf;

/* JADX INFO: loaded from: classes4.dex */
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@DefaultFor({c.t, c.f11484j, c.f11478c})
@Documented
@Retention(RetentionPolicy.RUNTIME)
@SubtypeOf({UnknownInitialization.class})
@DefaultQualifierInHierarchy
public @interface Initialized {
}
