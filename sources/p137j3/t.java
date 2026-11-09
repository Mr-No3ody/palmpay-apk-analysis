package p137j3;

import N8.q0;
import P0.c;
import com.facebook.common.references.CloseableReference;
import com.facebook.common.references.b;
import com.facebook.imagepipeline.memory.MemoryChunk;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import p262r2.f;

/* JADX INFO: loaded from: classes.dex */
public final class t extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f38252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f38253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f38254c;

    public t(r pool, int i7) {
        Intrinsics.checkNotNullParameter(pool, "pool");
        if (i7 <= 0) {
            throw new IllegalStateException("Check failed.");
        }
        this.f38252a = pool;
        this.f38254c = 0;
        this.f38253b = CloseableReference.j(pool.get(i7), pool, CloseableReference.f21217f);
    }

    public final s a() {
        if (!CloseableReference.h(this.f38253b)) {
            throw new c("OutputStream no longer valid", 14, false);
        }
        b bVar = this.f38253b;
        if (bVar != null) {
            return new s(bVar, this.f38254c);
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // p262r2.f, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        CloseableReference.d(this.f38253b);
        this.f38253b = null;
        this.f38254c = -1;
        super.close();
    }

    @Override // java.io.OutputStream
    public final void write(int i7) throws IOException {
        write(new byte[]{(byte) i7});
    }

    @Override // java.io.OutputStream
    public final void write(byte[] buffer, int i7, int i10) throws Throwable {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        if (i7 >= 0 && i10 >= 0 && i7 + i10 <= buffer.length) {
            if (CloseableReference.h(this.f38253b)) {
                int i11 = this.f38254c + i10;
                if (CloseableReference.h(this.f38253b)) {
                    b bVar = this.f38253b;
                    if (bVar != null) {
                        if (i11 > ((MemoryChunk) bVar.f()).getSize()) {
                            r rVar = this.f38252a;
                            Object obj = rVar.get(i11);
                            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                            MemoryChunk memoryChunk = (MemoryChunk) obj;
                            b bVar2 = this.f38253b;
                            if (bVar2 != null) {
                                ((MemoryChunk) bVar2.f()).copy(0, memoryChunk, 0, this.f38254c);
                                b bVar3 = this.f38253b;
                                Intrinsics.e(bVar3);
                                bVar3.close();
                                this.f38253b = CloseableReference.j(memoryChunk, rVar, CloseableReference.f21217f);
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        }
                        b bVar4 = this.f38253b;
                        if (bVar4 != null) {
                            ((MemoryChunk) bVar4.f()).write(this.f38254c, buffer, i7, i10);
                            this.f38254c += i10;
                            return;
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new c("OutputStream no longer valid", 14, false);
            }
            throw new c("OutputStream no longer valid", 14, false);
        }
        StringBuilder sbP = q0.p(buffer.length, "length=", i7, "; regionStart=", "; regionLength=");
        sbP.append(i10);
        throw new ArrayIndexOutOfBoundsException(sbP.toString());
    }
}
