package kotlin.jvm;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.MustBeDocumented;
import p371yf.a;
import p371yf.b;

/* JADX INFO: loaded from: classes4.dex */
@Target({ElementType.METHOD})
@kotlin.annotation.Target(allowedTargets = {b.f44355j, b.f44356o, b.f44357p, b.f44359w})
@Retention(RetentionPolicy.CLASS)
@kotlin.annotation.Retention(a.f44342b)
@MustBeDocumented
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\u0002\u0018\u00002\u00020\u0001B\b\u0012\u0006\u0010\u0002\u001a\u00020\u0003R\u000f\u0010\u0002\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/jvm/JvmName;", "", "name", "", "()Ljava/lang/String;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Documented
public @interface JvmName {
    String name();
}
