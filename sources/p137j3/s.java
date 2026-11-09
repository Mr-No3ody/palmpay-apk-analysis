package p137j3;

import P0.c;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.references.CloseableReference;
import com.facebook.common.references.b;
import com.facebook.imagepipeline.memory.MemoryChunk;
import java.nio.ByteBuffer;
import p213o2.e;

/* JADX INFO: loaded from: classes.dex */
public final class s implements PooledByteBuffer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CloseableReference f38251b;

    public s(b bVar, int i7) {
        bVar.getClass();
        if (!(i7 >= 0 && i7 <= ((MemoryChunk) bVar.f()).getSize())) {
            throw new IllegalArgumentException();
        }
        this.f38251b = bVar.clone();
        this.f38250a = i7;
    }

    public final synchronized void a() {
        if (isClosed()) {
            throw new c("Invalid bytebuf. Already closed", 16, false);
        }
    }

    @Override // com.facebook.common.memory.PooledByteBuffer, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        CloseableReference.d(this.f38251b);
        this.f38251b = null;
    }

    @Override // com.facebook.common.memory.PooledByteBuffer
    public final synchronized ByteBuffer getByteBuffer() {
        this.f38251b.getClass();
        return ((MemoryChunk) this.f38251b.f()).getByteBuffer();
    }

    @Override // com.facebook.common.memory.PooledByteBuffer
    public final synchronized long getNativePtr() {
        a();
        this.f38251b.getClass();
        return ((MemoryChunk) this.f38251b.f()).getNativePtr();
    }

    @Override // com.facebook.common.memory.PooledByteBuffer
    public final synchronized boolean isClosed() {
        return !CloseableReference.h(this.f38251b);
    }

    @Override // com.facebook.common.memory.PooledByteBuffer
    public final synchronized byte read(int i7) {
        a();
        e.a(Boolean.valueOf(i7 >= 0));
        e.a(Boolean.valueOf(i7 < this.f38250a));
        this.f38251b.getClass();
        return ((MemoryChunk) this.f38251b.f()).read(i7);
    }

    @Override // com.facebook.common.memory.PooledByteBuffer
    public final synchronized int size() {
        a();
        return this.f38250a;
    }

    @Override // com.facebook.common.memory.PooledByteBuffer
    public final synchronized int read(int i7, byte[] bArr, int i10, int i11) {
        a();
        e.a(Boolean.valueOf(i7 + i11 <= this.f38250a));
        this.f38251b.getClass();
        return ((MemoryChunk) this.f38251b.f()).read(i7, bArr, i10, i11);
    }
}
