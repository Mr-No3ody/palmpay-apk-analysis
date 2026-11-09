package W1;

import C0.G;
import N8.q0;
import com.adjust.sdk.Constants;
import com.horcrux.svg.d0;
import java.nio.ByteBuffer;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public final class i extends P4.c {

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final /* synthetic */ org.aspectj.runtime.reflect.b f10398Q;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final /* synthetic */ org.aspectj.runtime.reflect.b f10399X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final /* synthetic */ org.aspectj.runtime.reflect.b f10400Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final /* synthetic */ org.aspectj.runtime.reflect.b f10401Z;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final /* synthetic */ org.aspectj.runtime.reflect.b f10402k0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final /* synthetic */ org.aspectj.runtime.reflect.b f10403p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final /* synthetic */ org.aspectj.runtime.reflect.b f10404q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final /* synthetic */ org.aspectj.runtime.reflect.b f10405r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final /* synthetic */ org.aspectj.runtime.reflect.b f10406s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final /* synthetic */ org.aspectj.runtime.reflect.b f10407t0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public Date f10408B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public Date f10409C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public long f10410H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public long f10411L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public String f10412M;

    static {
        org.aspectj.runtime.reflect.a aVar = new org.aspectj.runtime.reflect.a(i.class, "MediaHeaderBox.java");
        f10398Q = aVar.e(aVar.d("getCreationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.util.Date"), 46);
        f10399X = aVar.e(aVar.d("getModificationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.util.Date"), 50);
        f10407t0 = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.lang.String"), 118);
        f10400Y = aVar.e(aVar.d("getTimescale", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", Constants.LONG), 54);
        f10401Z = aVar.e(aVar.d("getDuration", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", Constants.LONG), 58);
        f10402k0 = aVar.e(aVar.d("getLanguage", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.lang.String"), 62);
        f10403p0 = aVar.e(aVar.d("setCreationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "java.util.Date", "creationTime", "void"), 79);
        aVar.e(aVar.d("setModificationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "java.util.Date", "modificationTime", "void"), 83);
        f10404q0 = aVar.e(aVar.d("setTimescale", "com.coremedia.iso.boxes.MediaHeaderBox", Constants.LONG, "timescale", "void"), 87);
        f10405r0 = aVar.e(aVar.d("setDuration", "com.coremedia.iso.boxes.MediaHeaderBox", Constants.LONG, "duration", "void"), 91);
        f10406s0 = aVar.e(aVar.d("setLanguage", "com.coremedia.iso.boxes.MediaHeaderBox", "java.lang.String", "language", "void"), 95);
    }

    @Override // P4.c, P4.a
    public final void a(ByteBuffer byteBuffer) {
        h(byteBuffer);
        if (getVersion() == 1) {
            this.f10408B = org.chromium.support_lib_boundary.util.b.q(V1.a.k(byteBuffer));
            this.f10409C = org.chromium.support_lib_boundary.util.b.q(V1.a.k(byteBuffer));
            this.f10410H = V1.a.j(byteBuffer);
            this.f10411L = V1.a.k(byteBuffer);
        } else {
            this.f10408B = org.chromium.support_lib_boundary.util.b.q(V1.a.j(byteBuffer));
            this.f10409C = org.chromium.support_lib_boundary.util.b.q(V1.a.j(byteBuffer));
            this.f10410H = V1.a.j(byteBuffer);
            this.f10411L = V1.a.j(byteBuffer);
        }
        int iH = V1.a.h(byteBuffer);
        StringBuilder sb2 = new StringBuilder();
        for (int i7 = 0; i7 < 3; i7++) {
            sb2.append((char) (((iH >> ((2 - i7) * 5)) & 31) + 96));
        }
        this.f10412M = sb2.toString();
        V1.a.h(byteBuffer);
    }

    @Override // P4.c, P4.a
    public final void b(ByteBuffer byteBuffer) {
        i(byteBuffer);
        if (getVersion() == 1) {
            byteBuffer.putLong(org.chromium.support_lib_boundary.util.b.p(this.f10408B));
            byteBuffer.putLong(org.chromium.support_lib_boundary.util.b.p(this.f10409C));
            byteBuffer.putInt((int) this.f10410H);
            byteBuffer.putLong(this.f10411L);
        } else {
            byteBuffer.putInt((int) org.chromium.support_lib_boundary.util.b.p(this.f10408B));
            byteBuffer.putInt((int) org.chromium.support_lib_boundary.util.b.p(this.f10409C));
            byteBuffer.putInt((int) this.f10410H);
            byteBuffer.putInt((int) this.f10411L);
        }
        String str = this.f10412M;
        if (str.getBytes().length != 3) {
            throw new IllegalArgumentException(q0.k("\"", str, "\" language string isn't exactly 3 characters long!"));
        }
        int i7 = 0;
        for (int i10 = 0; i10 < 3; i10++) {
            i7 += (str.getBytes()[i10] - 96) << ((2 - i10) * 5);
        }
        V1.a.q(i7, byteBuffer);
        V1.a.q(0, byteBuffer);
    }

    @Override // P4.a
    public final long c() {
        return (getVersion() == 1 ? 32L : 20L) + 4;
    }

    public final String toString() {
        org.aspectj.runtime.reflect.c cVarB = org.aspectj.runtime.reflect.a.b(f10407t0, this, this);
        P4.f.a().getClass();
        P4.f.b(cVarB);
        StringBuilder sb2 = new StringBuilder("MediaHeaderBox[creationTime=");
        d0.s(org.aspectj.runtime.reflect.a.b(f10398Q, this, this));
        sb2.append(this.f10408B);
        sb2.append(";modificationTime=");
        d0.s(org.aspectj.runtime.reflect.a.b(f10399X, this, this));
        sb2.append(this.f10409C);
        sb2.append(";timescale=");
        d0.s(org.aspectj.runtime.reflect.a.b(f10400Y, this, this));
        sb2.append(this.f10410H);
        sb2.append(";duration=");
        d0.s(org.aspectj.runtime.reflect.a.b(f10401Z, this, this));
        sb2.append(this.f10411L);
        sb2.append(";language=");
        d0.s(org.aspectj.runtime.reflect.a.b(f10402k0, this, this));
        return G.r(sb2, this.f10412M, "]");
    }
}
