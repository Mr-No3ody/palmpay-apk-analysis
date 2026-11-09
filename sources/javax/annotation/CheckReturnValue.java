package javax.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import p329vf.a;

/* JADX INFO: loaded from: classes4.dex */
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.TYPE, ElementType.PACKAGE})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface CheckReturnValue {
    a when() default a.f43207a;
}
