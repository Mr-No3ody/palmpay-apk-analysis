package com.facebook.infer.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.annotation.Nonnull;
import javax.annotation.meta.TypeQualifierDefault;
import kotlin.annotations.jvm.UnderMigration;
import p386zf.a;

/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.TYPE})
@TypeQualifierDefault({ElementType.METHOD, ElementType.PARAMETER})
@Nonnull
@UnderMigration(status = a.f44698a)
@Retention(RetentionPolicy.CLASS)
public @interface Nullsafe {

    public @interface TrustList {
        boolean trustAll() default false;

        Class[] value();
    }

    TrustList trustOnly() default @TrustList(trustAll = true, value = {});

    p245q3.a value();
}
