package okhttp3.internal.http2;

import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSource;

/* JADX INFO: loaded from: classes4.dex */
public final class I implements PushObserver {
    @Override // okhttp3.internal.http2.PushObserver
    public final boolean onData(int i7, BufferedSource source, int i10, boolean z3) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        source.skip(i10);
        return true;
    }

    @Override // okhttp3.internal.http2.PushObserver
    public final boolean onHeaders(int i7, List responseHeaders, boolean z3) {
        Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
        return true;
    }

    @Override // okhttp3.internal.http2.PushObserver
    public final boolean onRequest(int i7, List requestHeaders) {
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        return true;
    }

    @Override // okhttp3.internal.http2.PushObserver
    public final void onReset(int i7, EnumC1932c errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
    }
}
