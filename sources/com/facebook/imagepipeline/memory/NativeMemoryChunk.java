package com.facebook.imagepipeline.memory;

import androidx.annotation.VisibleForTesting;
import com.facebook.common.internal.DoNotStrip;
import com.facebook.infer.annotation.Nullsafe;
import java.io.Closeable;
import java.nio.ByteBuffer;
import p213o2.e;
import p245q3.a;
import p377z5.l;

/* JADX INFO: loaded from: classes.dex */
@DoNotStrip
@Nullsafe(a.f41451a)
public class NativeMemoryChunk implements MemoryChunk, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f21440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f21441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f21442c;

    static {
        D3.a.r("imagepipeline");
    }

    public NativeMemoryChunk(int i7) {
        if (!(i7 > 0)) {
            throw new IllegalArgumentException();
        }
        this.f21441b = i7;
        this.f21440a = nativeAllocate(i7);
        this.f21442c = false;
    }

    @DoNotStrip
    private static native long nativeAllocate(int i7);

    @DoNotStrip
    private static native void nativeCopyFromByteArray(long j6, byte[] bArr, int i7, int i10);

    @DoNotStrip
    private static native void nativeCopyToByteArray(long j6, byte[] bArr, int i7, int i10);

    @DoNotStrip
    private static native void nativeFree(long j6);

    @DoNotStrip
    private static native void nativeMemcpy(long j6, long j10, int i7);

    @DoNotStrip
    private static native byte nativeReadByte(long j6);

    public final void a(int i7, MemoryChunk memoryChunk, int i10, int i11) {
        if (!(memoryChunk instanceof NativeMemoryChunk)) {
            throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
        }
        e.f(!isClosed());
        e.f(!memoryChunk.isClosed());
        l.e(i7, memoryChunk.getSize(), i10, i11, this.f21441b);
        nativeMemcpy(memoryChunk.getNativePtr() + ((long) i10), this.f21440a + ((long) i7), i11);
    }

    @Override // com.facebook.imagepipeline.memory.MemoryChunk, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (!this.f21442c) {
            this.f21442c = true;
            nativeFree(this.f21440a);
        }
    }

    @Override // com.facebook.imagepipeline.memory.MemoryChunk
    public final void copy(int i7, MemoryChunk memoryChunk, int i10, int i11) {
        memoryChunk.getClass();
        if (memoryChunk.getUniqueId() == this.f21440a) {
            Integer.toHexString(System.identityHashCode(this));
            Integer.toHexString(System.identityHashCode(memoryChunk));
            Long.toHexString(this.f21440a);
            e.a(Boolean.FALSE);
        }
        if (memoryChunk.getUniqueId() < this.f21440a) {
            synchronized (memoryChunk) {
                synchronized (this) {
                    a(i7, memoryChunk, i10, i11);
                }
            }
        } else {
            synchronized (this) {
                synchronized (memoryChunk) {
                    a(i7, memoryChunk, i10, i11);
                }
            }
        }
    }

    public final void finalize() throws Throwable {
        if (isClosed()) {
            return;
        }
        Integer.toHexString(System.identityHashCode(this));
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    @Override // com.facebook.imagepipeline.memory.MemoryChunk
    public final ByteBuffer getByteBuffer() {
        return null;
    }

    @Override // com.facebook.imagepipeline.memory.MemoryChunk
    public final long getNativePtr() {
        return this.f21440a;
    }

    @Override // com.facebook.imagepipeline.memory.MemoryChunk
    public final int getSize() {
        return this.f21441b;
    }

    @Override // com.facebook.imagepipeline.memory.MemoryChunk
    public final long getUniqueId() {
        return this.f21440a;
    }

    @Override // com.facebook.imagepipeline.memory.MemoryChunk
    public final synchronized boolean isClosed() {
        return this.f21442c;
    }

    @Override // com.facebook.imagepipeline.memory.MemoryChunk
    public final synchronized byte read(int i7) {
        boolean z3 = true;
        e.f(!isClosed());
        if (!(i7 >= 0)) {
            throw new IllegalArgumentException();
        }
        if (i7 >= this.f21441b) {
            z3 = false;
        }
        if (!z3) {
            throw new IllegalArgumentException();
        }
        return nativeReadByte(this.f21440a + ((long) i7));
    }

    @Override // com.facebook.imagepipeline.memory.MemoryChunk
    public final synchronized int write(int i7, byte[] bArr, int i10, int i11) {
        int iB;
        bArr.getClass();
        e.f(!isClosed());
        iB = l.b(i7, i11, this.f21441b);
        l.e(i7, bArr.length, i10, iB, this.f21441b);
        nativeCopyFromByteArray(this.f21440a + ((long) i7), bArr, i10, iB);
        return iB;
    }

    @VisibleForTesting
    public NativeMemoryChunk() {
        this.f21441b = 0;
        this.f21440a = 0L;
        this.f21442c = true;
    }

    @Override // com.facebook.imagepipeline.memory.MemoryChunk
    public final synchronized int read(int i7, byte[] bArr, int i10, int i11) {
        int iB;
        bArr.getClass();
        e.f(!isClosed());
        iB = l.b(i7, i11, this.f21441b);
        l.e(i7, bArr.length, i10, iB, this.f21441b);
        nativeCopyToByteArray(this.f21440a + ((long) i7), bArr, i10, iB);
        return iB;
    }
}
