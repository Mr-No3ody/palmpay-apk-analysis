package org.checkerframework.common.returnsreceiver.qual;

import Yg.a;
import Yg.c;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.checkerframework.framework.qual.DefaultFor;
import org.checkerframework.framework.qual.DefaultQualifierInHierarchy;
import org.checkerframework.framework.qual.QualifierForLiterals;
import org.checkerframework.framework.qual.SubtypeOf;

/* JADX INFO: loaded from: classes4.dex */
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@QualifierForLiterals({a.f11456a})
@DefaultFor({c.f11482g})
@Retention(RetentionPolicy.RUNTIME)
@SubtypeOf({})
@DefaultQualifierInHierarchy
public @interface UnknownThis {
}
