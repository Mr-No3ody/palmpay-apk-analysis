package androidx.room;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Target({})
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\u0002\u0018\u00002\u00020\u0001:\u0001\u0002B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\bR\u0011\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0004\u0010\bR\u0011\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0005\u0010\b¨\u0006\t"}, d2 = {"Landroidx/room/BuiltInTypeConverters;", "", "Landroidx/room/d;", "enums", "uuid", "byteBuffer", "<init>", "(Landroidx/room/d;Landroidx/room/d;Landroidx/room/d;)V", "()Landroidx/room/d;", "room-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.annotation.Target(allowedTargets = {})
@Retention(RetentionPolicy.CLASS)
@kotlin.annotation.Retention(p371yf.a.f44342b)
public @interface BuiltInTypeConverters {
    EnumC1225d byteBuffer() default EnumC1225d.f17743a;

    EnumC1225d enums() default EnumC1225d.f17743a;

    EnumC1225d uuid() default EnumC1225d.f17743a;
}
