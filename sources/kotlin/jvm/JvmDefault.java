package kotlin.jvm;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import p355xf.EnumC2125d;
import p371yf.b;

/* JADX INFO: loaded from: classes4.dex */
@Target({ElementType.METHOD})
@SinceKotlin(version = "1.2")
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lkotlin/jvm/JvmDefault;", "", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Deprecated(level = EnumC2125d.f43964c, message = "Switch to new -Xjvm-default modes: `all` or `all-compatibility`")
@kotlin.annotation.Target(allowedTargets = {b.f44355j, b.f44350d})
@Retention(RetentionPolicy.RUNTIME)
public @interface JvmDefault {
}
