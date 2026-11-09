package p137j3;

import com.facebook.imagepipeline.memory.MemoryChunk;
import java.io.Closeable;
import java.nio.ByteBuffer;
import p213o2.e;
import p377z5.l;

/* JADX INFO: loaded from: classes.dex */
public final class k implements MemoryChunk, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ByteBuffer f38239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f38240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f38241c = System.identityHashCode(this);

    public k(int i7) {
        this.f38239a = ByteBuffer.allocateDirect(i7);
        this.f38240b = i7;
    }

    public final void a(int i7, MemoryChunk memoryChunk, int i10, int i11) {
        if (!(memoryChunk instanceof k)) {
            throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
        }
        e.f(!isClosed());
        k kVar = (k) memoryChunk;
        e.f(!kVar.isClosed());
        this.f38239a.getClass();
        l.e(i7, kVar.f38240b, i10, i11, this.f38240b);
        this.f38239a.position(i7);
        ByteBuffer byteBuffer = kVar.getByteBuffer();
        byteBuffer.getClass();
        byteBuffer.position(i10);
        byte[] bArr = new byte[i11];
        this.f38239a.get(bArr, 0, i11);
        byteBuffer.put(bArr, 0, i11);
    }

    @Override // com.facebook.imagepipeline.memory.MemoryChunk, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f38239a = null;
    }

    @Override // com.facebook.imagepipeline.memory.MemoryChunk
    public final void copy(int i7, MemoryChunk memoryChunk, int i10, int i11) {
        memoryChunk.getClass();
        long uniqueId = memoryChunk.getUniqueId();
        long j6 = this.f38241c;
        if (uniqueId == j6) {
            Long.toHexString(j6);
            Long.toHexString(memoryChunk.getUniqueId());
            e.a(Boolean.FALSE);
        }
        if (memoryChunk.getUniqueId() < this.f38241c) {
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

    @Override // com.facebook.imagepipeline.memory.MemoryChunk
    public final synchronized ByteBuffer getByteBuffer() {
        return this.f38239a;
    }

    @Override // com.facebook.imagepipeline.memory.MemoryChunk
    public final long getNativePtr() {
        throw new UnsupportedOperationException("Cannot get the pointer of a BufferMemoryChunk");
    }

    @Override // com.facebook.imagepipeline.memory.MemoryChunk
    public final int getSize() {
        return this.f38240b;
    }

    @Override // com.facebook.imagepipeline.memory.MemoryChunk
    public final long getUniqueId() {
        return this.f38241c;
    }

    @Override // com.facebook.imagepipeline.memory.MemoryChunk
    public final synchronized boolean isClosed() {
        return this.f38239a == null;
    }

    @Override // com.facebook.imagepipeline.memory.MemoryChunk
    public final synchronized byte read(int i7) {
        e.f(!isClosed());
        e.a(Boolean.valueOf(i7 >= 0));
        e.a(Boolean.valueOf(i7 < this.f38240b));
        this.f38239a.getClass();
        return this.f38239a.get(i7);
    }

    @Override // com.facebook.imagepipeline.memory.MemoryChunk
    public final synchronized int write(int i7, byte[] bArr, int i10, int i11) {
        int iB;
        bArr.getClass();
        e.f(!isClosed());
        this.f38239a.getClass();
        iB = l.b(i7, i11, this.f38240b);
        l.e(i7, bArr.length, i10, iB, this.f38240b);
        this.f38239a.position(i7);
        this.f38239a.put(bArr, i10, iB);
        return iB;
    }

    @Override // com.facebook.imagepipeline.memory.MemoryChunk
    public final synchronized int read(int i7, byte[] bArr, int i10, int i11) {
        int iB;
        bArr.getClass();
        e.f(!isClosed());
        this.f38239a.getClass();
        iB = l.b(i7, i11, this.f38240b);
        l.e(i7, bArr.length, i10, iB, this.f38240b);
        this.f38239a.position(i7);
        this.f38239a.get(bArr, i10, iB);
        return iB;
    }
}
