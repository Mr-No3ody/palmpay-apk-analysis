package androidx.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.MustBeDocumented;
import kotlin.annotation.Repeatable;
import kotlin.jvm.internal.RepeatableContainer;
import p371yf.a;
import p371yf.b;

/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.PACKAGE})
@kotlin.annotation.Target(allowedTargets = {b.f44348b, b.f44347a, b.f44355j, b.f44356o, b.f44357p, b.f44354i, b.f44351e, b.f44359w})
@Retention(RetentionPolicy.CLASS)
@kotlin.annotation.Retention(a.f44342b)
@MustBeDocumented
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0014\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003R\u000f\u0010\u0002\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0005R\u000f\u0010\u0004\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/annotation/RequiresExtension;", "", "extension", "", "version", "()I", "annotation"}, k = 1, mv = {1, 7, 0}, xi = 48)
@Repeatable
@Documented
@java.lang.annotation.Repeatable(Container.class)
public @interface RequiresExtension {

    @Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.ANNOTATION_TYPE})
    @Metadata(k = 3, mv = {1, 7, 0}, xi = 48)
    @kotlin.annotation.Target(allowedTargets = {b.f44348b, b.f44347a, b.f44355j, b.f44356o, b.f44357p, b.f44354i, b.f44351e, b.f44359w})
    @Retention(RetentionPolicy.CLASS)
    @kotlin.annotation.Retention(a.f44342b)
    @RepeatableContainer
    public @interface Container {
        RequiresExtension[] value();
    }

    int extension();

    int version();
}
