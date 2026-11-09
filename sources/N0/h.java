package N0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class h extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f6038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable f6039b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i callbackName, Throwable cause) {
        super(cause);
        Intrinsics.checkNotNullParameter(callbackName, "callbackName");
        Intrinsics.checkNotNullParameter(cause, "cause");
        this.f6038a = callbackName;
        this.f6039b = cause;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f6039b;
    }
}
