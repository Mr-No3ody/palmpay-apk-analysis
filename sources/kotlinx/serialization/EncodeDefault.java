package kotlinx.serialization;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.MustBeDocumented;
import p104gg.a;
import p371yf.b;

/* JADX INFO: loaded from: classes4.dex */
@Target({})
@kotlin.annotation.Target(allowedTargets = {b.f44350d})
@Retention(RetentionPolicy.RUNTIME)
@MustBeDocumented
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0002\u0018\u00002\u00020\u0001:\u0001\u0002B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlinx/serialization/EncodeDefault;", "", "Lgg/a;", "mode", "<init>", "(Lgg/a;)V", "()Lgg/a;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ExperimentalSerializationApi
@Documented
public @interface EncodeDefault {
    a mode() default a.f37245a;
}
