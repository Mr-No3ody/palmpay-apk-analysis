package W1;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class q extends b {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final /* synthetic */ org.aspectj.runtime.reflect.b f10460H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final /* synthetic */ org.aspectj.runtime.reflect.b f10461L;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public long[] f10462C;

    static {
        org.aspectj.runtime.reflect.a aVar = new org.aspectj.runtime.reflect.a(q.class, "StaticChunkOffsetBox.java");
        f10460H = aVar.e(aVar.d("getChunkOffsets", "com.coremedia.iso.boxes.StaticChunkOffsetBox", "", "", "[J"), 39);
        f10461L = aVar.e(aVar.d("setChunkOffsets", "com.coremedia.iso.boxes.StaticChunkOffsetBox", "[J", "chunkOffsets", "void"), 48);
    }

    @Override // P4.c, P4.a
    public final void a(ByteBuffer byteBuffer) {
        h(byteBuffer);
        int iR = p140j8.f.r(V1.a.j(byteBuffer));
        this.f10462C = new long[iR];
        for (int i7 = 0; i7 < iR; i7++) {
            this.f10462C[i7] = V1.a.j(byteBuffer);
        }
    }

    @Override // P4.c, P4.a
    public final void b(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.f10462C.length);
        for (long j6 : this.f10462C) {
            byteBuffer.putInt((int) j6);
        }
    }

    @Override // P4.a
    public final long c() {
        return (this.f10462C.length * 4) + 8;
    }
}
