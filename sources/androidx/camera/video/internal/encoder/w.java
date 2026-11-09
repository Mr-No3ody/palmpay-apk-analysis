package androidx.camera.video.internal.encoder;

import E.AbstractC0198c;
import android.media.MediaCodec;
import com.google.common.util.concurrent.ListenableFuture;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class w implements InputBuffer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaCodec f14759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ByteBuffer f14761c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final androidx.concurrent.futures.m f14762d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final androidx.concurrent.futures.k f14763e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f14764f = new AtomicBoolean(false);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f14765g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f14766h = false;

    public w(MediaCodec mediaCodec, int i7) {
        mediaCodec.getClass();
        this.f14759a = mediaCodec;
        p118hf.a.i(i7);
        this.f14760b = i7;
        this.f14761c = mediaCodec.getInputBuffer(i7);
        AtomicReference atomicReference = new AtomicReference();
        this.f14762d = AbstractC0198c.y(new g(atomicReference, 3));
        androidx.concurrent.futures.k kVar = (androidx.concurrent.futures.k) atomicReference.get();
        kVar.getClass();
        this.f14763e = kVar;
    }

    @Override // androidx.camera.video.internal.encoder.InputBuffer
    public final boolean cancel() {
        androidx.concurrent.futures.k kVar = this.f14763e;
        if (this.f14764f.getAndSet(true)) {
            return false;
        }
        try {
            this.f14759a.queueInputBuffer(this.f14760b, 0, 0, 0L, 0);
            kVar.b(null);
        } catch (IllegalStateException e10) {
            kVar.d(e10);
        }
        return true;
    }

    @Override // androidx.camera.video.internal.encoder.InputBuffer
    public final ByteBuffer getByteBuffer() {
        if (this.f14764f.get()) {
            throw new IllegalStateException("The buffer is submitted or canceled.");
        }
        return this.f14761c;
    }

    @Override // androidx.camera.video.internal.encoder.InputBuffer
    public final ListenableFuture getTerminationFuture() {
        return androidx.camera.core.impl.utils.futures.j.e(this.f14762d);
    }

    @Override // androidx.camera.video.internal.encoder.InputBuffer
    public final void setEndOfStream(boolean z3) {
        if (this.f14764f.get()) {
            throw new IllegalStateException("The buffer is submitted or canceled.");
        }
        this.f14766h = z3;
    }

    @Override // androidx.camera.video.internal.encoder.InputBuffer
    public final void setPresentationTimeUs(long j6) {
        if (this.f14764f.get()) {
            throw new IllegalStateException("The buffer is submitted or canceled.");
        }
        p118hf.a.f(j6 >= 0);
        this.f14765g = j6;
    }

    @Override // androidx.camera.video.internal.encoder.InputBuffer
    public final boolean submit() {
        androidx.concurrent.futures.k kVar = this.f14763e;
        ByteBuffer byteBuffer = this.f14761c;
        if (this.f14764f.getAndSet(true)) {
            return false;
        }
        try {
            this.f14759a.queueInputBuffer(this.f14760b, byteBuffer.position(), byteBuffer.limit(), this.f14765g, this.f14766h ? 4 : 0);
            kVar.b(null);
            return true;
        } catch (IllegalStateException e10) {
            kVar.d(e10);
            return false;
        }
    }
}
