package androidx.camera.video.internal.encoder;

import E.AbstractC0198c;
import android.media.MediaCodec;
import com.google.common.util.concurrent.ListenableFuture;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class h implements EncodedData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaCodec f14675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediaCodec.BufferInfo f14676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14677c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ByteBuffer f14678d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final androidx.concurrent.futures.m f14679e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final androidx.concurrent.futures.k f14680f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f14681g = new AtomicBoolean(false);

    public h(MediaCodec mediaCodec, int i7, MediaCodec.BufferInfo bufferInfo) {
        mediaCodec.getClass();
        this.f14675a = mediaCodec;
        this.f14677c = i7;
        this.f14678d = mediaCodec.getOutputBuffer(i7);
        this.f14676b = bufferInfo;
        AtomicReference atomicReference = new AtomicReference();
        this.f14679e = AbstractC0198c.y(new g(atomicReference, 0));
        androidx.concurrent.futures.k kVar = (androidx.concurrent.futures.k) atomicReference.get();
        kVar.getClass();
        this.f14680f = kVar;
    }

    @Override // androidx.camera.video.internal.encoder.EncodedData, java.lang.AutoCloseable
    public final void close() {
        androidx.concurrent.futures.k kVar = this.f14680f;
        if (this.f14681g.getAndSet(true)) {
            return;
        }
        try {
            this.f14675a.releaseOutputBuffer(this.f14677c, false);
            kVar.b(null);
        } catch (IllegalStateException e10) {
            kVar.d(e10);
        }
    }

    @Override // androidx.camera.video.internal.encoder.EncodedData
    public final MediaCodec.BufferInfo getBufferInfo() {
        return this.f14676b;
    }

    @Override // androidx.camera.video.internal.encoder.EncodedData
    public final ByteBuffer getByteBuffer() {
        if (this.f14681g.get()) {
            throw new IllegalStateException("encoded data is closed.");
        }
        MediaCodec.BufferInfo bufferInfo = this.f14676b;
        int i7 = bufferInfo.offset;
        ByteBuffer byteBuffer = this.f14678d;
        byteBuffer.position(i7);
        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
        return byteBuffer;
    }

    @Override // androidx.camera.video.internal.encoder.EncodedData
    public final ListenableFuture getClosedFuture() {
        return androidx.camera.core.impl.utils.futures.j.e(this.f14679e);
    }

    @Override // androidx.camera.video.internal.encoder.EncodedData
    public final long getPresentationTimeUs() {
        return this.f14676b.presentationTimeUs;
    }

    @Override // androidx.camera.video.internal.encoder.EncodedData
    public final boolean isKeyFrame() {
        return (this.f14676b.flags & 1) != 0;
    }

    @Override // androidx.camera.video.internal.encoder.EncodedData
    public final long size() {
        return this.f14676b.size;
    }
}
