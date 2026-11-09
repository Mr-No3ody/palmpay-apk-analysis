package p137j3;

import android.os.SharedMemory;
import android.system.ErrnoException;
import com.facebook.imagepipeline.memory.MemoryChunk;
import java.io.Closeable;
import java.nio.ByteBuffer;
import p213o2.e;
import p377z5.l;

/* JADX INFO: loaded from: classes.dex */
public final class a implements MemoryChunk, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SharedMemory f38209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ByteBuffer f38210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f38211c;

    public a(int i7) {
        if (!(i7 > 0)) {
            throw new IllegalArgumentException();
        }
        try {
            SharedMemory sharedMemoryCreate = SharedMemory.create("AshmemMemoryChunk", i7);
            this.f38209a = sharedMemoryCreate;
            this.f38210b = sharedMemoryCreate.mapReadWrite();
            this.f38211c = System.identityHashCode(this);
        } catch (ErrnoException e10) {
            throw new RuntimeException("Fail to create AshmemMemory", e10);
        }
    }

    public final void a(int i7, MemoryChunk memoryChunk, int i10, int i11) {
        if (!(memoryChunk instanceof a)) {
            throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
        }
        e.f(!isClosed());
        a aVar = (a) memoryChunk;
        e.f(!aVar.isClosed());
        this.f38210b.getClass();
        aVar.f38210b.getClass();
        l.e(i7, aVar.getSize(), i10, i11, getSize());
        this.f38210b.position(i7);
        aVar.f38210b.position(i10);
        byte[] bArr = new byte[i11];
        this.f38210b.get(bArr, 0, i11);
        aVar.f38210b.put(bArr, 0, i11);
    }

    @Override // com.facebook.imagepipeline.memory.MemoryChunk, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (!isClosed()) {
                SharedMemory sharedMemory = this.f38209a;
                if (sharedMemory != null) {
                    sharedMemory.close();
                }
                ByteBuffer byteBuffer = this.f38210b;
                if (byteBuffer != null) {
                    SharedMemory.unmap(byteBuffer);
                }
                this.f38210b = null;
                this.f38209a = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.facebook.imagepipeline.memory.MemoryChunk
    public final void copy(int i7, MemoryChunk memoryChunk, int i10, int i11) {
        memoryChunk.getClass();
        long uniqueId = memoryChunk.getUniqueId();
        long j6 = this.f38211c;
        if (uniqueId == j6) {
            Long.toHexString(j6);
            Long.toHexString(memoryChunk.getUniqueId());
            e.a(Boolean.FALSE);
        }
        if (memoryChunk.getUniqueId() < this.f38211c) {
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
    public final ByteBuffer getByteBuffer() {
        return this.f38210b;
    }

    @Override // com.facebook.imagepipeline.memory.MemoryChunk
    public final long getNativePtr() {
        throw new UnsupportedOperationException("Cannot get the pointer of an  AshmemMemoryChunk");
    }

    @Override // com.facebook.imagepipeline.memory.MemoryChunk
    public final int getSize() {
        this.f38209a.getClass();
        return this.f38209a.getSize();
    }

    @Override // com.facebook.imagepipeline.memory.MemoryChunk
    public final long getUniqueId() {
        return this.f38211c;
    }

    @Override // com.facebook.imagepipeline.memory.MemoryChunk
    public final synchronized boolean isClosed() {
        return this.f38210b == null || this.f38209a == null;
    }

    @Override // com.facebook.imagepipeline.memory.MemoryChunk
    public final synchronized byte read(int i7) {
        e.f(!isClosed());
        e.a(Boolean.valueOf(i7 >= 0));
        e.a(Boolean.valueOf(i7 < getSize()));
        this.f38210b.getClass();
        return this.f38210b.get(i7);
    }

    @Override // com.facebook.imagepipeline.memory.MemoryChunk
    public final synchronized int write(int i7, byte[] bArr, int i10, int i11) {
        int iB;
        bArr.getClass();
        this.f38210b.getClass();
        iB = l.b(i7, i11, getSize());
        l.e(i7, bArr.length, i10, iB, getSize());
        this.f38210b.position(i7);
        this.f38210b.put(bArr, i10, iB);
        return iB;
    }

    @Override // com.facebook.imagepipeline.memory.MemoryChunk
    public final synchronized int read(int i7, byte[] bArr, int i10, int i11) {
        int iB;
        bArr.getClass();
        this.f38210b.getClass();
        iB = l.b(i7, i11, getSize());
        l.e(i7, bArr.length, i10, iB, getSize());
        this.f38210b.position(i7);
        this.f38210b.get(bArr, i10, iB);
        return iB;
    }
}
