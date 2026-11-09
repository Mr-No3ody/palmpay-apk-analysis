package javax.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import javax.annotation.meta.TypeQualifier;
import p329vf.a;

/* JADX INFO: loaded from: classes4.dex */
@TypeQualifier(applicableTo = Number.class)
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface Nonnegative {
    a when() default a.f43207a;
}
