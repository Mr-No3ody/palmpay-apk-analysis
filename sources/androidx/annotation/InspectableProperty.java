package androidx.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Deprecated;
import kotlin.Metadata;
import p371yf.a;
import p371yf.b;

/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.METHOD})
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\u0002\u0018\u00002\u00020\u0001:\u0003\u0017\u0018\bBO\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n¢\u0006\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0013R\u0011\u0010\t\u001a\u00020\b8\u0006¢\u0006\u0006\u001a\u0004\b\t\u0010\u0014R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\u0006\u001a\u0004\b\f\u0010\u0015R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n8\u0006¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0016¨\u0006\u0019"}, d2 = {"Landroidx/annotation/InspectableProperty;", "", "", "name", "", "attributeId", "", "hasAttributeId", "Ln/a;", "valueType", "", "Landroidx/annotation/InspectableProperty$EnumEntry;", "enumMapping", "Landroidx/annotation/InspectableProperty$FlagEntry;", "flagMapping", "<init>", "(Ljava/lang/String;IZLn/a;Lkotlin/Array;Lkotlin/Array;)V", "()Ljava/lang/String;", "()I", "()Z", "()Ln/a;", "()[Landroidx/annotation/InspectableProperty$EnumEntry;", "()[Landroidx/annotation/InspectableProperty$FlagEntry;", "EnumEntry", "FlagEntry", "annotation"}, k = 1, mv = {1, 7, 0}, xi = 48)
@Deprecated(message = "Replaced by the androidx.resourceinpsection package.")
@kotlin.annotation.Target(allowedTargets = {b.f44355j, b.f44356o, b.f44357p})
@Retention(RetentionPolicy.SOURCE)
@kotlin.annotation.Retention(a.f44341a)
public @interface InspectableProperty {

    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005R\u000f\u0010\u0002\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0006R\u000f\u0010\u0004\u001a\u00020\u0005¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/annotation/InspectableProperty$EnumEntry;", "", "name", "", "value", "", "()Ljava/lang/String;", "()I", "annotation"}, k = 1, mv = {1, 7, 0}, xi = 48)
    @kotlin.annotation.Target(allowedTargets = {b.f44348b, b.f44347a})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(a.f44341a)
    public @interface EnumEntry {
        String name();

        int value();
    }

    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0002\u0018\u00002\u00020\u0001B\u001a\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005R\u000f\u0010\u0006\u001a\u00020\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000f\u0010\u0002\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0002\u0010\bR\u000f\u0010\u0004\u001a\u00020\u0005¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0007¨\u0006\t"}, d2 = {"Landroidx/annotation/InspectableProperty$FlagEntry;", "", "name", "", "target", "", "mask", "()I", "()Ljava/lang/String;", "annotation"}, k = 1, mv = {1, 7, 0}, xi = 48)
    @kotlin.annotation.Target(allowedTargets = {b.f44348b, b.f44347a})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(a.f44341a)
    public @interface FlagEntry {
        int mask() default 0;

        String name();

        int target();
    }

    int attributeId() default 0;

    EnumEntry[] enumMapping() default {};

    FlagEntry[] flagMapping() default {};

    boolean hasAttributeId() default true;

    String name() default "";

    p192n.a valueType() default p192n.a.f39795a;
}
