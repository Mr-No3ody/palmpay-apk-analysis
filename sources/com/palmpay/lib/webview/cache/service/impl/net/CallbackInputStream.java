package com.palmpay.lib.webview.cache.service.impl.net;

import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001cB\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\"\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0014\u001a\u00020\fH\u0016J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\fH\u0016J\b\u0010\u0018\u001a\u00020\u0016H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0016H\u0016R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001d"}, d2 = {"Lcom/palmpay/lib/webview/cache/service/impl/net/CallbackInputStream;", "Ljava/io/InputStream;", "stream", "callback", "Lcom/palmpay/lib/webview/cache/service/impl/net/CallbackInputStream$StreamCallback;", "<init>", "(Ljava/io/InputStream;Lcom/palmpay/lib/webview/cache/service/impl/net/CallbackInputStream$StreamCallback;)V", "getStream", "()Ljava/io/InputStream;", "getCallback", "()Lcom/palmpay/lib/webview/cache/service/impl/net/CallbackInputStream$StreamCallback;", "read", "", "b", "", "off", "len", "skip", "", "n", "available", "mark", "", "readlimit", "reset", "markSupported", "", "close", "StreamCallback", "lib_webview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CallbackInputStream extends InputStream {

    @Nullable
    private final StreamCallback callback;

    @NotNull
    private final InputStream stream;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/palmpay/lib/webview/cache/service/impl/net/CallbackInputStream$StreamCallback;", "", "onClose", "", "lib_webview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface StreamCallback {
        void onClose();
    }

    public CallbackInputStream(@NotNull InputStream stream, @Nullable StreamCallback streamCallback) {
        Intrinsics.checkNotNullParameter(stream, "stream");
        this.stream = stream;
        this.callback = streamCallback;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.stream.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.stream.close();
        StreamCallback streamCallback = this.callback;
        if (streamCallback != null) {
            streamCallback.onClose();
        }
    }

    @Nullable
    public final StreamCallback getCallback() {
        return this.callback;
    }

    @NotNull
    public final InputStream getStream() {
        return this.stream;
    }

    @Override // java.io.InputStream
    public void mark(int readlimit) {
        this.stream.mark(readlimit);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.stream.markSupported();
    }

    @Override // java.io.InputStream
    public int read() {
        return this.stream.read();
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        this.stream.reset();
    }

    @Override // java.io.InputStream
    public long skip(long n10) {
        return this.stream.skip(n10);
    }

    @Override // java.io.InputStream
    public int read(@Nullable byte[] b7) {
        return this.stream.read(b7);
    }

    @Override // java.io.InputStream
    public int read(@Nullable byte[] b7, int off, int len) {
        return this.stream.read(b7, off, len);
    }
}
