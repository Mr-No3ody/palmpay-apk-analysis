package kotlinx.coroutines;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.RequiresOptIn;
import kotlin.annotation.MustBeDocumented;
import p355xf.n;
import p371yf.a;
import p371yf.b;

/* JADX INFO: loaded from: classes4.dex */
@Target({ElementType.TYPE, ElementType.METHOD})
@RequiresOptIn(level = n.f43973a, message = "This declaration is in a preview state and can be changed in a backwards-incompatible manner with a best-effort migration. Its usage should be marked with '@kotlinx.coroutines.FlowPreview' or '@OptIn(kotlinx.coroutines.FlowPreview::class)' if you accept the drawback of relying on preview API")
@kotlin.annotation.Target(allowedTargets = {b.f44347a, b.f44355j, b.f44345A, b.f44350d})
@Retention(RetentionPolicy.CLASS)
@kotlin.annotation.Retention(a.f44342b)
@MustBeDocumented
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/FlowPreview;", "", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Documented
public @interface FlowPreview {
}
