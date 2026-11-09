package okhttp3.internal.http2;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class L extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EnumC1932c f40801a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(EnumC1932c errorCode) {
        super("stream was reset: " + errorCode);
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        this.f40801a = errorCode;
    }
}
