package W1;

import C0.G;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class t extends P4.c {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ org.aspectj.runtime.reflect.b f10464C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final /* synthetic */ org.aspectj.runtime.reflect.b f10465H;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public long[] f10466B;

    static {
        org.aspectj.runtime.reflect.a aVar = new org.aspectj.runtime.reflect.a(t.class, "SyncSampleBox.java");
        aVar.e(aVar.d("getSampleNumber", "com.coremedia.iso.boxes.SyncSampleBox", "", "", "[J"), 46);
        f10464C = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.SyncSampleBox", "", "", "java.lang.String"), 77);
        f10465H = aVar.e(aVar.d("setSampleNumber", "com.coremedia.iso.boxes.SyncSampleBox", "[J", "sampleNumber", "void"), 81);
    }

    @Override // P4.c, P4.a
    public final void a(ByteBuffer byteBuffer) {
        h(byteBuffer);
        int iR = p140j8.f.r(V1.a.j(byteBuffer));
        this.f10466B = new long[iR];
        for (int i7 = 0; i7 < iR; i7++) {
            this.f10466B[i7] = V1.a.j(byteBuffer);
        }
    }

    @Override // P4.c, P4.a
    public final void b(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.f10466B.length);
        for (long j6 : this.f10466B) {
            byteBuffer.putInt((int) j6);
        }
    }

    @Override // P4.a
    public final long c() {
        return (this.f10466B.length * 4) + 8;
    }

    public final String toString() {
        org.aspectj.runtime.reflect.c cVarB = org.aspectj.runtime.reflect.a.b(f10464C, this, this);
        P4.f.a().getClass();
        P4.f.b(cVarB);
        return G.n(this.f10466B.length, "]", new StringBuilder("SyncSampleBox[entryCount="));
    }
}
