package kotlin.internal;

import Hf.d;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.annotation.Repeatable;
import kotlin.jvm.internal.RepeatableContainer;
import p355xf.EnumC2125d;
import p371yf.a;
import p371yf.b;

/* JADX INFO: loaded from: classes4.dex */
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR})
@SinceKotlin(version = "1.2")
@kotlin.annotation.Target(allowedTargets = {b.f44347a, b.f44355j, b.f44350d, b.f44354i, b.f44345A})
@Retention(RetentionPolicy.SOURCE)
@kotlin.annotation.Retention(a.f44341a)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0081\u0002\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\rR\u0011\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0004\u0010\rR\u0011\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u000eR\u0011\u0010\b\u001a\u00020\u00078\u0006¢\u0006\u0006\u001a\u0004\b\b\u0010\u000fR\u0011\u0010\n\u001a\u00020\t8\u0006¢\u0006\u0006\u001a\u0004\b\n\u0010\u0010¨\u0006\u0011"}, d2 = {"Lkotlin/internal/RequireKotlin;", "", "", "version", "message", "Lxf/d;", FirebaseAnalytics.Param.LEVEL, "LHf/d;", "versionKind", "", "errorCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lxf/d;LHf/d;I)V", "()Ljava/lang/String;", "()Lxf/d;", "()LHf/d;", "()I", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Repeatable
@java.lang.annotation.Repeatable(Container.class)
public @interface RequireKotlin {

    @Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR})
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.annotation.Target(allowedTargets = {b.f44347a, b.f44355j, b.f44350d, b.f44354i, b.f44345A})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(a.f44341a)
    @RepeatableContainer
    public @interface Container {
        RequireKotlin[] value();
    }

    int errorCode() default -1;

    EnumC2125d level() default EnumC2125d.f43963b;

    String message() default "";

    String version();

    d versionKind() default d.f3925a;
}
