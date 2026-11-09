package org.checkerframework.common.returnsreceiver.qual;

import Yg.c;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.checkerframework.framework.qual.PolymorphicQualifier;
import org.checkerframework.framework.qual.TargetLocations;

/* JADX INFO: loaded from: classes4.dex */
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@TargetLocations({c.f11479d, c.f11481f})
@Retention(RetentionPolicy.RUNTIME)
@PolymorphicQualifier
public @interface This {
}
