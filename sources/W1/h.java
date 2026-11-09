package W1;

import com.adjust.sdk.Constants;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class h extends a {

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final /* synthetic */ org.aspectj.runtime.reflect.b f10393M;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f10394B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f10395C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public long f10396H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public long f10397L;

    static {
        org.aspectj.runtime.reflect.a aVar = new org.aspectj.runtime.reflect.a(h.class, "HintMediaHeaderBox.java");
        aVar.e(aVar.d("getMaxPduSize", "com.coremedia.iso.boxes.HintMediaHeaderBox", "", "", "int"), 42);
        aVar.e(aVar.d("getAvgPduSize", "com.coremedia.iso.boxes.HintMediaHeaderBox", "", "", "int"), 46);
        aVar.e(aVar.d("getMaxBitrate", "com.coremedia.iso.boxes.HintMediaHeaderBox", "", "", Constants.LONG), 50);
        aVar.e(aVar.d("getAvgBitrate", "com.coremedia.iso.boxes.HintMediaHeaderBox", "", "", Constants.LONG), 54);
        f10393M = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.HintMediaHeaderBox", "", "", "java.lang.String"), 84);
    }

    @Override // P4.c, P4.a
    public final void a(ByteBuffer byteBuffer) {
        h(byteBuffer);
        this.f10394B = V1.a.h(byteBuffer);
        this.f10395C = V1.a.h(byteBuffer);
        this.f10396H = V1.a.j(byteBuffer);
        this.f10397L = V1.a.j(byteBuffer);
        V1.a.j(byteBuffer);
    }

    @Override // P4.c, P4.a
    public final void b(ByteBuffer byteBuffer) {
        i(byteBuffer);
        V1.a.q(this.f10394B, byteBuffer);
        V1.a.q(this.f10395C, byteBuffer);
        byteBuffer.putInt((int) this.f10396H);
        byteBuffer.putInt((int) this.f10397L);
        byteBuffer.putInt((int) 0);
    }

    @Override // P4.a
    public final long c() {
        return 20L;
    }

    public final String toString() {
        org.aspectj.runtime.reflect.c cVarB = org.aspectj.runtime.reflect.a.b(f10393M, this, this);
        P4.f.a().getClass();
        P4.f.b(cVarB);
        return "HintMediaHeaderBox{maxPduSize=" + this.f10394B + ", avgPduSize=" + this.f10395C + ", maxBitrate=" + this.f10396H + ", avgBitrate=" + this.f10397L + '}';
    }
}
