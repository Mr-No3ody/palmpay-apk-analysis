package org.checkerframework.checker.fenum.qual;

import Yg.c;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.checkerframework.framework.qual.DefaultFor;
import org.checkerframework.framework.qual.DefaultQualifierInHierarchy;
import org.checkerframework.framework.qual.SubtypeOf;

/* JADX INFO: loaded from: classes4.dex */
@Target({})
@DefaultFor({c.f11478c})
@Documented
@Retention(RetentionPolicy.RUNTIME)
@SubtypeOf({FenumTop.class})
@DefaultQualifierInHierarchy
public @interface FenumUnqualified {
}
