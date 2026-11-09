package androidx.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.annotation.MustBeDocumented;
import p371yf.a;

/* JADX INFO: loaded from: classes.dex */
@MustBeDocumented
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/annotation/VisibleForTesting;", "", "", "otherwise", "<init>", "(I)V", "()I", "annotation"}, k = 1, mv = {1, 7, 0}, xi = 48)
@Documented
@Retention(RetentionPolicy.CLASS)
@kotlin.annotation.Retention(a.f44342b)
public @interface VisibleForTesting {
    int otherwise() default 2;
}
