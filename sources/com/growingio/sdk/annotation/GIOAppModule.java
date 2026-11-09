package com.growingio.sdk.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes3.dex */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.CLASS)
public @interface GIOAppModule {
    Class<?> config() default Void.class;

    String configName() default "Track";

    String name() default "GrowingTracker";
}
