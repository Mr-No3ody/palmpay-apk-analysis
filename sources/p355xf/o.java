package p355xf;

import androidx.camera.core.impl.utils.executor.g;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class o {
    public /* synthetic */ o(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @InlineOnly
    @JvmName(name = "failure")
    private final <T> Object failure(Throwable exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        p pVarF = g.f(exception);
        o oVar = q.f43977a;
        return pVarF;
    }

    @InlineOnly
    @JvmName(name = "success")
    private final <T> Object success(T t) {
        o oVar = q.f43977a;
        return t;
    }

    private o() {
    }
}
