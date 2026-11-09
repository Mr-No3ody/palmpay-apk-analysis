package kotlinx.coroutines;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.RequiresOptIn;
import p355xf.n;
import p371yf.b;

/* JADX INFO: loaded from: classes4.dex */
@Target({ElementType.TYPE})
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/InternalForInheritanceCoroutinesApi;", "", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@RequiresOptIn(level = n.f43973a, message = "This is a kotlinx.coroutines API that is not intended to be inherited from, as the library may handle predefined instances of this in a special manner. This will be an error in a future release. If you need to inherit from this, please describe your use case in https://github.com/Kotlin/kotlinx.coroutines/issues, so that we can provide a stable API for inheritance. ")
@kotlin.annotation.Target(allowedTargets = {b.f44347a})
@Retention(RetentionPolicy.RUNTIME)
public @interface InternalForInheritanceCoroutinesApi {
}
