package kotlin;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import p355xf.n;
import p371yf.a;
import p371yf.b;

/* JADX INFO: loaded from: classes4.dex */
@Target({ElementType.ANNOTATION_TYPE})
@SinceKotlin(version = "1.3")
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\bR\u0011\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\u0006\u001a\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"Lkotlin/RequiresOptIn;", "", "", "message", "Lxf/n;", FirebaseAnalytics.Param.LEVEL, "<init>", "(Ljava/lang/String;Lxf/n;)V", "()Ljava/lang/String;", "()Lxf/n;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlin.annotation.Target(allowedTargets = {b.f44348b})
@Retention(RetentionPolicy.CLASS)
@kotlin.annotation.Retention(a.f44342b)
public @interface RequiresOptIn {
    n level() default n.f43974b;

    String message() default "";
}
