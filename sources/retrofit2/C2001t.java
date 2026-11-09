package retrofit2;

import okhttp3.h0;
import okio.BufferedSource;

/* JADX INFO: renamed from: retrofit2.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2001t extends h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final okhttp3.L f41953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f41954b;

    public C2001t(okhttp3.L l5, long j6) {
        this.f41953a = l5;
        this.f41954b = j6;
    }

    @Override // okhttp3.h0
    public final long contentLength() {
        return this.f41954b;
    }

    @Override // okhttp3.h0
    public final okhttp3.L contentType() {
        return this.f41953a;
    }

    @Override // okhttp3.h0
    public final BufferedSource source() {
        throw new IllegalStateException("Cannot read raw response body of a converted body.");
    }
}
