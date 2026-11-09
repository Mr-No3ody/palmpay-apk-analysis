package androidx.camera.core.impl.annotation;

import androidx.annotation.RestrictTo;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import p192n.c;

/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.SOURCE)
@RestrictTo({c.f39801b})
public @interface ExecutedBy {
    String value();
}
