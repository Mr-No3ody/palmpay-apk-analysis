package androidx.versionedparcelable;

import androidx.annotation.RestrictTo;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import p192n.c;

/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.SOURCE)
@RestrictTo({c.f39802c})
public @interface VersionedParcelize {
    boolean allowSerialization() default false;

    int[] deprecatedIds() default {};

    Class factory() default void.class;

    boolean ignoreParcelables() default false;

    boolean isCustom() default false;

    String jetifyAs() default "";
}
