package kotlin;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.MustBeDocumented;
import p355xf.EnumC2125d;
import p371yf.b;

/* JADX INFO: loaded from: classes4.dex */
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.ANNOTATION_TYPE})
@MustBeDocumented
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\u0002\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\nR\u0011\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\u0006\u001a\u0004\b\u0007\u0010\f¨\u0006\r"}, d2 = {"Lkotlin/Deprecated;", "", "", "message", "Lkotlin/ReplaceWith;", "replaceWith", "Lxf/d;", FirebaseAnalytics.Param.LEVEL, "<init>", "(Ljava/lang/String;Lkotlin/ReplaceWith;Lxf/d;)V", "()Ljava/lang/String;", "()Lkotlin/ReplaceWith;", "()Lxf/d;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlin.annotation.Target(allowedTargets = {b.f44347a, b.f44355j, b.f44350d, b.f44348b, b.f44354i, b.f44357p, b.f44356o, b.f44345A})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface Deprecated {
    EnumC2125d level() default EnumC2125d.f43962a;

    String message();

    ReplaceWith replaceWith() default @ReplaceWith(expression = "", imports = {});
}
