package com.google.net.cronet.okhttptransport;

import androidx.annotation.Nullable;
import okhttp3.L;
import okhttp3.h0;
import okio.BufferedSource;

/* JADX INFO: loaded from: classes3.dex */
abstract class CronetTransportResponseBody extends h0 {
    private final h0 delegate;

    public CronetTransportResponseBody(h0 h0Var) {
        this.delegate = h0Var;
    }

    @Override // okhttp3.h0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.delegate.close();
        customCloseHook();
    }

    @Override // okhttp3.h0
    public final long contentLength() {
        return this.delegate.contentLength();
    }

    @Override // okhttp3.h0
    @Nullable
    public final L contentType() {
        return this.delegate.contentType();
    }

    public abstract void customCloseHook();

    @Override // okhttp3.h0
    public final BufferedSource source() {
        return this.delegate.source();
    }
}
