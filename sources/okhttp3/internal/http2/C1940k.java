package okhttp3.internal.http2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: okhttp3.internal.http2.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1940k extends m {
    @Override // okhttp3.internal.http2.m
    public final void b(E stream) {
        Intrinsics.checkNotNullParameter(stream, "stream");
        stream.c(EnumC1932c.REFUSED_STREAM, null);
    }
}
