package org.checkerframework.checker.i18n.qual;

import Yg.a;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.checkerframework.framework.qual.QualifierForLiterals;
import org.checkerframework.framework.qual.SubtypeOf;

/* JADX INFO: loaded from: classes4.dex */
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@QualifierForLiterals({a.f11457b, a.f11458c, a.f11459d, a.f11460e, a.f11461f})
@Documented
@Retention(RetentionPolicy.RUNTIME)
@SubtypeOf({UnknownLocalized.class})
public @interface Localized {
}
