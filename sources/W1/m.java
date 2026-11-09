package W1;

import N8.q0;
import com.adjust.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.horcrux.svg.d0;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class m extends P4.c {

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final /* synthetic */ org.aspectj.runtime.reflect.b f10443L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final /* synthetic */ org.aspectj.runtime.reflect.b f10444M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final /* synthetic */ org.aspectj.runtime.reflect.b f10445Q;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final /* synthetic */ org.aspectj.runtime.reflect.b f10446X;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public long f10447B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public long[] f10448C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f10449H;

    static {
        org.aspectj.runtime.reflect.a aVar = new org.aspectj.runtime.reflect.a(m.class, "SampleSizeBox.java");
        f10443L = aVar.e(aVar.d("getSampleSize", "com.coremedia.iso.boxes.SampleSizeBox", "", "", Constants.LONG), 50);
        aVar.e(aVar.d("setSampleSize", "com.coremedia.iso.boxes.SampleSizeBox", Constants.LONG, "sampleSize", "void"), 54);
        aVar.e(aVar.d("getSampleSizeAtIndex", "com.coremedia.iso.boxes.SampleSizeBox", "int", FirebaseAnalytics.Param.INDEX, Constants.LONG), 59);
        f10444M = aVar.e(aVar.d("getSampleCount", "com.coremedia.iso.boxes.SampleSizeBox", "", "", Constants.LONG), 67);
        aVar.e(aVar.d("getSampleSizes", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "[J"), 76);
        f10445Q = aVar.e(aVar.d("setSampleSizes", "com.coremedia.iso.boxes.SampleSizeBox", "[J", "sampleSizes", "void"), 80);
        f10446X = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "java.lang.String"), 119);
    }

    @Override // P4.c, P4.a
    public final void a(ByteBuffer byteBuffer) {
        h(byteBuffer);
        this.f10447B = V1.a.j(byteBuffer);
        int iR = p140j8.f.r(V1.a.j(byteBuffer));
        this.f10449H = iR;
        if (this.f10447B == 0) {
            this.f10448C = new long[iR];
            for (int i7 = 0; i7 < this.f10449H; i7++) {
                this.f10448C[i7] = V1.a.j(byteBuffer);
            }
        }
    }

    @Override // P4.c, P4.a
    public final void b(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt((int) this.f10447B);
        if (this.f10447B != 0) {
            byteBuffer.putInt(this.f10449H);
            return;
        }
        byteBuffer.putInt(this.f10448C.length);
        for (long j6 : this.f10448C) {
            byteBuffer.putInt((int) j6);
        }
    }

    @Override // P4.a
    public final long c() {
        return (this.f10447B == 0 ? this.f10448C.length * 4 : 0) + 12;
    }

    public final String toString() {
        org.aspectj.runtime.reflect.c cVarB = org.aspectj.runtime.reflect.a.b(f10446X, this, this);
        P4.f.a().getClass();
        P4.f.b(cVarB);
        StringBuilder sb2 = new StringBuilder("SampleSizeBox[sampleSize=");
        d0.s(org.aspectj.runtime.reflect.a.b(f10443L, this, this));
        sb2.append(this.f10447B);
        sb2.append(";sampleCount=");
        d0.s(org.aspectj.runtime.reflect.a.b(f10444M, this, this));
        return q0.n(sb2, "]", this.f10447B > 0 ? this.f10449H : this.f10448C.length);
    }
}
