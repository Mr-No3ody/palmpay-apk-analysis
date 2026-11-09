package androidx.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.MustBeDocumented;
import p192n.c;
import p371yf.a;
import p371yf.b;

/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.PACKAGE})
@kotlin.annotation.Target(allowedTargets = {b.f44348b, b.f44347a, b.f44355j, b.f44356o, b.f44357p, b.f44354i, b.f44351e, b.f44359w})
@Retention(RetentionPolicy.CLASS)
@kotlin.annotation.Retention(a.f44342b)
@MustBeDocumented
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u001b\u0012\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/annotation/RestrictTo;", "", "", "Ln/c;", "value", "<init>", "(Lkotlin/Array;)V", "()[Ln/c;", "annotation"}, k = 1, mv = {1, 7, 0}, xi = 48)
@Documented
public @interface RestrictTo {
    c[] value();
}
