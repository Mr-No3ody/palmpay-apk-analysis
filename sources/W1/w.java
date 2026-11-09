package W1;

import com.adjust.sdk.Constants;
import com.facebook.imageutils.JfifUtil;
import com.facebook.react.uimanager.ViewProps;
import com.google.mlkit.common.MlKitException;
import com.horcrux.svg.d0;
import java.nio.ByteBuffer;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public final class w extends P4.c {

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public static final /* synthetic */ org.aspectj.runtime.reflect.b f10472A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public static final /* synthetic */ org.aspectj.runtime.reflect.b f10473B0;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public static final /* synthetic */ org.aspectj.runtime.reflect.b f10474C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public static final /* synthetic */ org.aspectj.runtime.reflect.b f10475D0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public static final /* synthetic */ org.aspectj.runtime.reflect.b f10476E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public static final /* synthetic */ org.aspectj.runtime.reflect.b f10477F0;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public static final /* synthetic */ org.aspectj.runtime.reflect.b f10478G0;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public static final /* synthetic */ org.aspectj.runtime.reflect.b f10479H0;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public static final /* synthetic */ org.aspectj.runtime.reflect.b f10480I0;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public static final /* synthetic */ org.aspectj.runtime.reflect.b f10481J0;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public static final /* synthetic */ org.aspectj.runtime.reflect.b f10482K0;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public static final /* synthetic */ org.aspectj.runtime.reflect.b f10483L0;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public static final /* synthetic */ org.aspectj.runtime.reflect.b f10484M0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final /* synthetic */ org.aspectj.runtime.reflect.b f10485p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final /* synthetic */ org.aspectj.runtime.reflect.b f10486q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final /* synthetic */ org.aspectj.runtime.reflect.b f10487r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final /* synthetic */ org.aspectj.runtime.reflect.b f10488s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final /* synthetic */ org.aspectj.runtime.reflect.b f10489t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final /* synthetic */ org.aspectj.runtime.reflect.b f10490u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final /* synthetic */ org.aspectj.runtime.reflect.b f10491v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final /* synthetic */ org.aspectj.runtime.reflect.b f10492w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final /* synthetic */ org.aspectj.runtime.reflect.b f10493x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final /* synthetic */ org.aspectj.runtime.reflect.b f10494y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final /* synthetic */ org.aspectj.runtime.reflect.b f10495z0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public Date f10496B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public Date f10497C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public long f10498H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public long f10499L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f10500M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public int f10501Q;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public float f10502X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public T4.e f10503Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public double f10504Z;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public double f10505k0;

    static {
        org.aspectj.runtime.reflect.a aVar = new org.aspectj.runtime.reflect.a(w.class, "TrackHeaderBox.java");
        f10485p0 = aVar.e(aVar.d("getCreationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "java.util.Date"), 60);
        f10486q0 = aVar.e(aVar.d("getModificationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "java.util.Date"), 64);
        f10494y0 = aVar.e(aVar.d("getContent", "com.coremedia.iso.boxes.TrackHeaderBox", "java.nio.ByteBuffer", "byteBuffer", "void"), 142);
        f10495z0 = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "java.lang.String"), 170);
        f10472A0 = aVar.e(aVar.d("setCreationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "java.util.Date", "creationTime", "void"), 196);
        f10473B0 = aVar.e(aVar.d("setModificationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "java.util.Date", "modificationTime", "void"), MlKitException.CODE_SCANNER_APP_NAME_UNAVAILABLE);
        f10474C0 = aVar.e(aVar.d("setTrackId", "com.coremedia.iso.boxes.TrackHeaderBox", Constants.LONG, "trackId", "void"), 211);
        f10475D0 = aVar.e(aVar.d("setDuration", "com.coremedia.iso.boxes.TrackHeaderBox", Constants.LONG, "duration", "void"), JfifUtil.MARKER_RST7);
        f10476E0 = aVar.e(aVar.d("setLayer", "com.coremedia.iso.boxes.TrackHeaderBox", "int", "layer", "void"), 222);
        f10477F0 = aVar.e(aVar.d("setAlternateGroup", "com.coremedia.iso.boxes.TrackHeaderBox", "int", "alternateGroup", "void"), 226);
        f10478G0 = aVar.e(aVar.d("setVolume", "com.coremedia.iso.boxes.TrackHeaderBox", "float", "volume", "void"), 230);
        f10479H0 = aVar.e(aVar.d("setMatrix", "com.coremedia.iso.boxes.TrackHeaderBox", "com.googlecode.mp4parser.util.Matrix", "matrix", "void"), 234);
        f10487r0 = aVar.e(aVar.d("getTrackId", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", Constants.LONG), 68);
        f10480I0 = aVar.e(aVar.d("setWidth", "com.coremedia.iso.boxes.TrackHeaderBox", "double", "width", "void"), 238);
        f10481J0 = aVar.e(aVar.d("setHeight", "com.coremedia.iso.boxes.TrackHeaderBox", "double", "height", "void"), 242);
        aVar.e(aVar.d(com.google.firebase.perf.util.Constants.ENABLE_DISABLE, "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "boolean"), 247);
        aVar.e(aVar.d("isInMovie", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "boolean"), 251);
        aVar.e(aVar.d("isInPreview", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "boolean"), 255);
        aVar.e(aVar.d("isInPoster", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "boolean"), 259);
        f10482K0 = aVar.e(aVar.d("setEnabled", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", ViewProps.ENABLED, "void"), 263);
        f10483L0 = aVar.e(aVar.d("setInMovie", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "inMovie", "void"), 271);
        f10484M0 = aVar.e(aVar.d("setInPreview", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "inPreview", "void"), 279);
        aVar.e(aVar.d("setInPoster", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "inPoster", "void"), 287);
        f10488s0 = aVar.e(aVar.d("getDuration", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", Constants.LONG), 72);
        f10489t0 = aVar.e(aVar.d("getLayer", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "int"), 76);
        f10490u0 = aVar.e(aVar.d("getAlternateGroup", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "int"), 80);
        f10491v0 = aVar.e(aVar.d("getVolume", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "float"), 84);
        aVar.e(aVar.d("getMatrix", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "com.googlecode.mp4parser.util.Matrix"), 88);
        f10492w0 = aVar.e(aVar.d("getWidth", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "double"), 92);
        f10493x0 = aVar.e(aVar.d("getHeight", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "double"), 96);
    }

    @Override // P4.c, P4.a
    public final void a(ByteBuffer byteBuffer) {
        h(byteBuffer);
        if (getVersion() == 1) {
            this.f10496B = org.chromium.support_lib_boundary.util.b.q(V1.a.k(byteBuffer));
            this.f10497C = org.chromium.support_lib_boundary.util.b.q(V1.a.k(byteBuffer));
            this.f10498H = V1.a.j(byteBuffer);
            V1.a.j(byteBuffer);
            long j6 = byteBuffer.getLong();
            this.f10499L = j6;
            if (j6 < -1) {
                throw new RuntimeException("The tracks duration is bigger than Long.MAX_VALUE");
            }
        } else {
            this.f10496B = org.chromium.support_lib_boundary.util.b.q(V1.a.j(byteBuffer));
            this.f10497C = org.chromium.support_lib_boundary.util.b.q(V1.a.j(byteBuffer));
            this.f10498H = V1.a.j(byteBuffer);
            V1.a.j(byteBuffer);
            this.f10499L = V1.a.j(byteBuffer);
        }
        V1.a.j(byteBuffer);
        V1.a.j(byteBuffer);
        this.f10500M = V1.a.h(byteBuffer);
        this.f10501Q = V1.a.h(byteBuffer);
        this.f10502X = V1.a.g(byteBuffer);
        V1.a.h(byteBuffer);
        this.f10503Y = T4.e.a(byteBuffer);
        this.f10504Z = V1.a.f(byteBuffer);
        this.f10505k0 = V1.a.f(byteBuffer);
    }

    @Override // P4.c, P4.a
    public final void b(ByteBuffer byteBuffer) {
        org.aspectj.runtime.reflect.c cVarC = org.aspectj.runtime.reflect.a.c(f10494y0, this, this, byteBuffer);
        P4.f.a().getClass();
        P4.f.b(cVarC);
        i(byteBuffer);
        if (getVersion() == 1) {
            byteBuffer.putLong(org.chromium.support_lib_boundary.util.b.p(this.f10496B));
            byteBuffer.putLong(org.chromium.support_lib_boundary.util.b.p(this.f10497C));
            byteBuffer.putInt((int) this.f10498H);
            byteBuffer.putInt((int) 0);
            byteBuffer.putLong(this.f10499L);
        } else {
            byteBuffer.putInt((int) org.chromium.support_lib_boundary.util.b.p(this.f10496B));
            byteBuffer.putInt((int) org.chromium.support_lib_boundary.util.b.p(this.f10497C));
            byteBuffer.putInt((int) this.f10498H);
            byteBuffer.putInt((int) 0);
            byteBuffer.putInt((int) this.f10499L);
        }
        int i7 = (int) 0;
        byteBuffer.putInt(i7);
        byteBuffer.putInt(i7);
        V1.a.q(this.f10500M, byteBuffer);
        V1.a.q(this.f10501Q, byteBuffer);
        V1.a.p(byteBuffer, this.f10502X);
        V1.a.q(0, byteBuffer);
        this.f10503Y.b(byteBuffer);
        V1.a.o(byteBuffer, this.f10504Z);
        V1.a.o(byteBuffer, this.f10505k0);
    }

    @Override // P4.a
    public final long c() {
        return (getVersion() == 1 ? 36L : 24L) + 60;
    }

    public final String toString() {
        org.aspectj.runtime.reflect.c cVarB = org.aspectj.runtime.reflect.a.b(f10495z0, this, this);
        P4.f.a().getClass();
        P4.f.b(cVarB);
        StringBuilder sb2 = new StringBuilder("TrackHeaderBox[creationTime=");
        d0.s(org.aspectj.runtime.reflect.a.b(f10485p0, this, this));
        sb2.append(this.f10496B);
        sb2.append(";modificationTime=");
        d0.s(org.aspectj.runtime.reflect.a.b(f10486q0, this, this));
        sb2.append(this.f10497C);
        sb2.append(";trackId=");
        d0.s(org.aspectj.runtime.reflect.a.b(f10487r0, this, this));
        sb2.append(this.f10498H);
        sb2.append(";duration=");
        d0.s(org.aspectj.runtime.reflect.a.b(f10488s0, this, this));
        sb2.append(this.f10499L);
        sb2.append(";layer=");
        d0.s(org.aspectj.runtime.reflect.a.b(f10489t0, this, this));
        sb2.append(this.f10500M);
        sb2.append(";alternateGroup=");
        d0.s(org.aspectj.runtime.reflect.a.b(f10490u0, this, this));
        sb2.append(this.f10501Q);
        sb2.append(";volume=");
        d0.s(org.aspectj.runtime.reflect.a.b(f10491v0, this, this));
        sb2.append(this.f10502X);
        sb2.append(";matrix=");
        sb2.append(this.f10503Y);
        sb2.append(";width=");
        d0.s(org.aspectj.runtime.reflect.a.b(f10492w0, this, this));
        sb2.append(this.f10504Z);
        sb2.append(";height=");
        d0.s(org.aspectj.runtime.reflect.a.b(f10493x0, this, this));
        sb2.append(this.f10505k0);
        sb2.append("]");
        return sb2.toString();
    }
}
