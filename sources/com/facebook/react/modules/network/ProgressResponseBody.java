package com.facebook.react.modules.network;

import Pg.AbstractC0555b;
import Pg.k;
import Pg.o;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.L;
import okhttp3.h0;
import okio.BufferedSource;
import okio.Source;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\b\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\b\u0010\u0012R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014R\u0016\u0010\u0015\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/facebook/react/modules/network/ProgressResponseBody;", "Lokhttp3/h0;", "responseBody", "Lcom/facebook/react/modules/network/ProgressListener;", "progressListener", "<init>", "(Lokhttp3/h0;Lcom/facebook/react/modules/network/ProgressListener;)V", "Lokio/Source;", "source", "(Lokio/Source;)Lokio/Source;", "Lokhttp3/L;", "contentType", "()Lokhttp3/L;", "", "contentLength", "()J", "totalBytesRead", "Lokio/BufferedSource;", "()Lokio/BufferedSource;", "Lokhttp3/h0;", "Lcom/facebook/react/modules/network/ProgressListener;", "bufferedSource", "Lokio/BufferedSource;", "J", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ProgressResponseBody extends h0 {
    private BufferedSource bufferedSource;

    @NotNull
    private final ProgressListener progressListener;

    @NotNull
    private final h0 responseBody;
    private long totalBytesRead;

    public ProgressResponseBody(@NotNull h0 responseBody, @NotNull ProgressListener progressListener) {
        Intrinsics.checkNotNullParameter(responseBody, "responseBody");
        Intrinsics.checkNotNullParameter(progressListener, "progressListener");
        this.responseBody = responseBody;
        this.progressListener = progressListener;
    }

    @Override // okhttp3.h0
    public long contentLength() {
        return this.responseBody.contentLength();
    }

    @Override // okhttp3.h0
    @Nullable
    public L contentType() {
        return this.responseBody.contentType();
    }

    @Override // okhttp3.h0
    @NotNull
    public BufferedSource source() {
        if (this.bufferedSource == null) {
            Source source = source(this.responseBody.source());
            Intrinsics.checkNotNullParameter(source, "source");
            this.bufferedSource = AbstractC0555b.c(source);
        }
        BufferedSource bufferedSource = this.bufferedSource;
        if (bufferedSource != null) {
            return bufferedSource;
        }
        Intrinsics.n("bufferedSource");
        throw null;
    }

    /* JADX INFO: renamed from: totalBytesRead, reason: from getter */
    public final long getTotalBytesRead() {
        return this.totalBytesRead;
    }

    private final Source source(Source source) {
        return new o(source) { // from class: com.facebook.react.modules.network.ProgressResponseBody.source.1
            @Override // Pg.o, okio.Source
            public long read(k sink, long byteCount) throws IOException {
                Intrinsics.checkNotNullParameter(sink, "sink");
                long j6 = super.read(sink, byteCount);
                ProgressResponseBody progressResponseBody = this;
                if (j6 != -1) {
                    progressResponseBody.totalBytesRead += j6;
                }
                progressResponseBody.progressListener.onProgress(progressResponseBody.totalBytesRead, progressResponseBody.responseBody.contentLength(), j6 == -1);
                return j6;
            }
        };
    }
}
