package com.facebook.react.modules.network;

import Pg.AbstractC0555b;
import Pg.w;
import java.io.FilterOutputStream;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.L;
import okhttp3.c0;
import okio.BufferedSink;
import okio.Sink;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0016R\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/facebook/react/modules/network/ProgressRequestBody;", "Lokhttp3/c0;", "requestBody", "Lcom/facebook/react/modules/network/ProgressListener;", "progressListener", "<init>", "(Lokhttp3/c0;Lcom/facebook/react/modules/network/ProgressListener;)V", "Lokio/BufferedSink;", "sink", "Lokio/Sink;", "outputStreamSink", "(Lokio/BufferedSink;)Lokio/Sink;", "Lokhttp3/L;", "contentType", "()Lokhttp3/L;", "", "contentLength", "()J", "", "writeTo", "(Lokio/BufferedSink;)V", "Lokhttp3/c0;", "Lcom/facebook/react/modules/network/ProgressListener;", "J", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ProgressRequestBody extends c0 {
    private long contentLength;

    @NotNull
    private final ProgressListener progressListener;

    @NotNull
    private final c0 requestBody;

    public ProgressRequestBody(@NotNull c0 requestBody, @NotNull ProgressListener progressListener) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(progressListener, "progressListener");
        this.requestBody = requestBody;
        this.progressListener = progressListener;
    }

    private final Sink outputStreamSink(BufferedSink sink) {
        FilterOutputStream outputStream = new FilterOutputStream(sink.outputStream()) { // from class: com.facebook.react.modules.network.ProgressRequestBody.outputStreamSink.1
            private long count;

            public final void sendProgressUpdate() throws IOException {
                long j6 = this.count;
                long jContentLength = ProgressRequestBody.this.contentLength();
                ProgressRequestBody.this.progressListener.onProgress(j6, jContentLength, j6 == jContentLength);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(byte[] data, int offset, int byteCount) throws IOException {
                Intrinsics.checkNotNullParameter(data, "data");
                super.write(data, offset, byteCount);
                this.count += (long) byteCount;
                sendProgressUpdate();
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(int data) throws IOException {
                super.write(data);
                this.count++;
                sendProgressUpdate();
            }
        };
        Intrinsics.checkNotNullParameter(outputStream, "outputStream");
        return AbstractC0555b.h(outputStream);
    }

    @Override // okhttp3.c0
    public long contentLength() throws IOException {
        if (this.contentLength == 0) {
            this.contentLength = this.requestBody.contentLength();
        }
        return this.contentLength;
    }

    @Override // okhttp3.c0
    @Nullable
    public L contentType() {
        return this.requestBody.contentType();
    }

    @Override // okhttp3.c0
    public void writeTo(@NotNull BufferedSink sink) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        Sink sink2 = outputStreamSink(sink);
        Intrinsics.checkNotNullParameter(sink2, "sink");
        w wVarB = AbstractC0555b.b(sink2);
        contentLength();
        this.requestBody.writeTo(wVarB);
        wVarB.flush();
    }
}
