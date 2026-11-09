package org.checkerframework.checker.i18n.qual;

import Yg.c;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.checkerframework.framework.qual.DefaultFor;
import org.checkerframework.framework.qual.SubtypeOf;
import org.checkerframework.framework.qual.TargetLocations;

/* JADX INFO: loaded from: classes4.dex */
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@TargetLocations({c.f11483i, c.f11486p})
@DefaultFor({c.f11482g})
@Documented
@Retention(RetentionPolicy.RUNTIME)
@SubtypeOf({LocalizableKey.class})
public @interface LocalizableKeyBottom {
}
