package com.bumptech.glide.load.resource.bitmap;

import android.media.MediaDataSource;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class F extends MediaDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ByteBuffer f20897a;

    public F(ByteBuffer byteBuffer) {
        this.f20897a = byteBuffer;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return this.f20897a.limit();
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j6, byte[] bArr, int i7, int i10) {
        ByteBuffer byteBuffer = this.f20897a;
        if (j6 >= byteBuffer.limit()) {
            return -1;
        }
        byteBuffer.position((int) j6);
        int iMin = Math.min(i10, byteBuffer.remaining());
        byteBuffer.get(bArr, i7, iMin);
        return iMin;
    }
}
