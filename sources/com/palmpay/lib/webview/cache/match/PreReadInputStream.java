package com.palmpay.lib.webview.cache.match;

import androidx.annotation.Keep;
import com.palmpay.lib.webview.cache.WebCacheConstant;
import com.palmpay.lib.webview.cache.util.WebCacheLog;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0011J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0011H\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/palmpay/lib/webview/cache/match/PreReadInputStream;", "Ljava/io/InputStream;", "unreadStream", "Ljava/io/BufferedInputStream;", "<init>", "(Ljava/io/BufferedInputStream;)V", "readStream", "readData", "Ljava/io/ByteArrayOutputStream;", "unreadStreamFinish", "", "readStreamFinish", "preReadStarted", "Ljava/util/concurrent/atomic/AtomicBoolean;", "preReadStopPoint", "closed", "startPreRead", "", "finishPreRead", "read", "", "close", "Companion", "lib_webview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPreReadInputStream.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreReadInputStream.kt\ncom/palmpay/lib/webview/cache/match/PreReadInputStream\n+ 2 WebCacheLog.kt\ncom/palmpay/lib/webview/cache/util/WebCacheLogKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,173:1\n9#2,4:174\n9#2,4:178\n9#2,4:183\n9#2,4:187\n9#2,4:191\n9#2,4:195\n9#2,4:199\n9#2,4:203\n9#2,4:207\n9#2,4:211\n1#3:182\n*S KotlinDebug\n*F\n+ 1 PreReadInputStream.kt\ncom/palmpay/lib/webview/cache/match/PreReadInputStream\n*L\n63#1:174,4\n72#1:178,4\n82#1:183,4\n91#1:187,4\n96#1:191,4\n108#1:195,4\n120#1:199,4\n125#1:203,4\n141#1:207,4\n165#1:211,4\n*E\n"})
public final class PreReadInputStream extends InputStream {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Deprecated
    @NotNull
    public static final String TAG = "PreReadInputStream";

    @NotNull
    private final AtomicBoolean closed;

    @NotNull
    private final AtomicBoolean preReadStarted;

    @NotNull
    private final AtomicBoolean preReadStopPoint;

    @Nullable
    private ByteArrayOutputStream readData;

    @Nullable
    private BufferedInputStream readStream;
    private boolean readStreamFinish;

    @Nullable
    private BufferedInputStream unreadStream;
    private boolean unreadStreamFinish;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/palmpay/lib/webview/cache/match/PreReadInputStream$Companion;", "", "<init>", "()V", "TAG", "", "lib_webview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public PreReadInputStream(@NotNull BufferedInputStream unreadStream) {
        Intrinsics.checkNotNullParameter(unreadStream, "unreadStream");
        this.unreadStreamFinish = true;
        this.readStreamFinish = true;
        this.preReadStarted = new AtomicBoolean(false);
        this.preReadStopPoint = new AtomicBoolean(false);
        this.closed = new AtomicBoolean(false);
        this.unreadStream = unreadStream;
        this.unreadStreamFinish = false;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.closed.compareAndSet(false, true)) {
            this.preReadStopPoint.set(true);
            WebCacheLog webCacheLog = WebCacheLog.INSTANCE;
            if (webCacheLog.getCanLog()) {
                webCacheLog.d(TAG, "close pre-read stream, readStreamFinish = " + this.readStreamFinish + ", unreadStreamFinish = " + this.unreadStreamFinish);
            }
            BufferedInputStream bufferedInputStream = this.readStream;
            if (bufferedInputStream != null) {
                try {
                    bufferedInputStream.close();
                    this.readStream = null;
                } catch (Throwable th) {
                    th = th;
                    this.readStream = null;
                }
            }
            th = null;
            BufferedInputStream bufferedInputStream2 = this.unreadStream;
            if (bufferedInputStream2 != null) {
                try {
                    bufferedInputStream2.close();
                } catch (Throwable th2) {
                    th = th2;
                }
                this.unreadStream = null;
            }
            this.readData = null;
            if (th != null) {
                WebCacheLog webCacheLog2 = WebCacheLog.INSTANCE;
                if (webCacheLog2.getCanLog()) {
                    webCacheLog2.e(TAG, th);
                }
                if (!(th instanceof IOException)) {
                    throw new IOException(th);
                }
                throw th;
            }
        }
    }

    public final void finishPreRead() {
        if (this.preReadStopPoint.compareAndSet(false, true)) {
            WebCacheLog webCacheLog = WebCacheLog.INSTANCE;
            if (webCacheLog.getCanLog()) {
                webCacheLog.d(TAG, "Pre-read stream finished.");
            }
            synchronized (this) {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = this.readData;
                    if (byteArrayOutputStream != null) {
                        this.readStream = new BufferedInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
                        this.readStreamFinish = false;
                        if (webCacheLog.getCanLog()) {
                            ByteArrayOutputStream byteArrayOutputStream2 = this.readData;
                            Integer numValueOf = byteArrayOutputStream2 != null ? Integer.valueOf(byteArrayOutputStream2.size()) : null;
                            webCacheLog.d(TAG, "Pre-read data size=" + numValueOf + ", unreadStreamFinish = " + this.unreadStreamFinish);
                        }
                        Unit unit = Unit.f38893a;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        int i7;
        try {
            if (this.readStreamFinish) {
                i7 = -1;
            } else {
                BufferedInputStream bufferedInputStream = this.readStream;
                i7 = bufferedInputStream != null ? bufferedInputStream.read() : -1;
                WebCacheLog webCacheLog = WebCacheLog.INSTANCE;
                if (webCacheLog.getCanLog() && -1 == i7) {
                    webCacheLog.d(TAG, "Read from readStream finished.");
                }
            }
            if (-1 == i7) {
                this.readStreamFinish = true;
                if (!this.unreadStreamFinish) {
                    BufferedInputStream bufferedInputStream2 = this.unreadStream;
                    i7 = bufferedInputStream2 != null ? bufferedInputStream2.read() : -1;
                    if (-1 == i7) {
                        this.unreadStreamFinish = true;
                        WebCacheLog webCacheLog2 = WebCacheLog.INSTANCE;
                        if (webCacheLog2.getCanLog()) {
                            webCacheLog2.d(TAG, "Read from unreadStream finished.");
                        }
                    }
                }
            }
            return i7;
        } catch (Throwable th) {
            WebCacheLog webCacheLog3 = WebCacheLog.INSTANCE;
            if (webCacheLog3.getCanLog()) {
                webCacheLog3.e(TAG, th);
            }
            if (th instanceof IOException) {
                throw th;
            }
            throw new IOException(th);
        }
    }

    public final void startPreRead() {
        BufferedInputStream bufferedInputStream = this.unreadStream;
        if (bufferedInputStream == null) {
            return;
        }
        if (!this.preReadStarted.compareAndSet(false, true)) {
            WebCacheLog webCacheLog = WebCacheLog.INSTANCE;
            if (webCacheLog.getCanLog()) {
                webCacheLog.e(TAG, "Pre-read already started, cannot start twice.");
                return;
            }
            return;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            this.readData = byteArrayOutputStream;
            byte[] bArr = new byte[WebCacheConstant.NET_READ_BUFFER_SIZE];
            synchronized (this) {
                try {
                    WebCacheLog webCacheLog2 = WebCacheLog.INSTANCE;
                    if (webCacheLog2.getCanLog()) {
                        webCacheLog2.d(TAG, "Start to pre-read stream.");
                    }
                    int i7 = 0;
                    while (!this.preReadStopPoint.get() && (i7 = bufferedInputStream.read(bArr)) != -1) {
                        byteArrayOutputStream.write(bArr, 0, i7);
                    }
                    if (-1 == i7) {
                        this.unreadStreamFinish = true;
                        finishPreRead();
                    }
                    Unit unit = Unit.f38893a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Exception e10) {
            WebCacheLog webCacheLog3 = WebCacheLog.INSTANCE;
            if (webCacheLog3.getCanLog()) {
                webCacheLog3.e(TAG, "Pre-read stream error", e10);
            }
        }
    }
}
