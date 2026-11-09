package W1;

import N8.q0;
import com.adjust.sdk.Constants;
import com.facebook.imageutils.JfifUtil;
import com.facebook.imageutils.TiffUtil;
import com.google.mlkit.common.MlKitException;
import com.horcrux.svg.d0;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import java.nio.ByteBuffer;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public final class j extends P4.c {

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public static final /* synthetic */ org.aspectj.runtime.reflect.b f10413A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public static final /* synthetic */ org.aspectj.runtime.reflect.b f10414B0;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public static final /* synthetic */ org.aspectj.runtime.reflect.b f10415C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public static final /* synthetic */ org.aspectj.runtime.reflect.b f10416D0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public static final /* synthetic */ org.aspectj.runtime.reflect.b f10417E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public static final /* synthetic */ org.aspectj.runtime.reflect.b f10418F0;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public static final /* synthetic */ org.aspectj.runtime.reflect.b f10419G0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final /* synthetic */ org.aspectj.runtime.reflect.b f10420t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final /* synthetic */ org.aspectj.runtime.reflect.b f10421u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final /* synthetic */ org.aspectj.runtime.reflect.b f10422v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final /* synthetic */ org.aspectj.runtime.reflect.b f10423w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final /* synthetic */ org.aspectj.runtime.reflect.b f10424x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final /* synthetic */ org.aspectj.runtime.reflect.b f10425y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final /* synthetic */ org.aspectj.runtime.reflect.b f10426z0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public Date f10427B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public Date f10428C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public long f10429H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public long f10430L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public double f10431M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public float f10432Q;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public T4.e f10433X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public long f10434Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public int f10435Z;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public int f10436k0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f10437p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f10438q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f10439r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f10440s0;

    static {
        org.aspectj.runtime.reflect.a aVar = new org.aspectj.runtime.reflect.a(j.class, "MovieHeaderBox.java");
        f10420t0 = aVar.e(aVar.d("getCreationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "java.util.Date"), 63);
        f10421u0 = aVar.e(aVar.d("getModificationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "java.util.Date"), 67);
        f10415C0 = aVar.e(aVar.d("setModificationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "java.util.Date", "modificationTime", "void"), MlKitException.CODE_SCANNER_APP_NAME_UNAVAILABLE);
        f10416D0 = aVar.e(aVar.d("setTimescale", "com.coremedia.iso.boxes.MovieHeaderBox", Constants.LONG, "timescale", "void"), 211);
        f10417E0 = aVar.e(aVar.d("setDuration", "com.coremedia.iso.boxes.MovieHeaderBox", Constants.LONG, "duration", "void"), JfifUtil.MARKER_RST7);
        aVar.e(aVar.d("setRate", "com.coremedia.iso.boxes.MovieHeaderBox", "double", "rate", "void"), 222);
        aVar.e(aVar.d("setVolume", "com.coremedia.iso.boxes.MovieHeaderBox", "float", "volume", "void"), 226);
        f10418F0 = aVar.e(aVar.d("setMatrix", "com.coremedia.iso.boxes.MovieHeaderBox", "com.googlecode.mp4parser.util.Matrix", "matrix", "void"), 230);
        f10419G0 = aVar.e(aVar.d("setNextTrackId", "com.coremedia.iso.boxes.MovieHeaderBox", Constants.LONG, "nextTrackId", "void"), 234);
        aVar.e(aVar.d("getPreviewTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "int"), 238);
        aVar.e(aVar.d("setPreviewTime", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "previewTime", "void"), 242);
        aVar.e(aVar.d("getPreviewDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "int"), 246);
        f10422v0 = aVar.e(aVar.d("getTimescale", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", Constants.LONG), 71);
        aVar.e(aVar.d("setPreviewDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "previewDuration", "void"), 250);
        aVar.e(aVar.d("getPosterTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "int"), 254);
        aVar.e(aVar.d("setPosterTime", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "posterTime", "void"), 258);
        aVar.e(aVar.d("getSelectionTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "int"), 262);
        aVar.e(aVar.d("setSelectionTime", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "selectionTime", "void"), 266);
        aVar.e(aVar.d("getSelectionDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "int"), 270);
        aVar.e(aVar.d("setSelectionDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "selectionDuration", "void"), TiffUtil.TIFF_TAG_ORIENTATION);
        aVar.e(aVar.d("getCurrentTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "int"), 278);
        aVar.e(aVar.d("setCurrentTime", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "currentTime", "void"), MessageEvent.EVENT_REFRESH_BANK_CARD_LIST);
        f10423w0 = aVar.e(aVar.d("getDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", Constants.LONG), 75);
        f10424x0 = aVar.e(aVar.d("getRate", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "double"), 79);
        f10425y0 = aVar.e(aVar.d("getVolume", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "float"), 83);
        aVar.e(aVar.d("getMatrix", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "com.googlecode.mp4parser.util.Matrix"), 87);
        f10426z0 = aVar.e(aVar.d("getNextTrackId", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", Constants.LONG), 91);
        f10413A0 = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "java.lang.String"), 139);
        f10414B0 = aVar.e(aVar.d("setCreationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "java.util.Date", "creationTime", "void"), 195);
    }

    @Override // P4.c, P4.a
    public final void a(ByteBuffer byteBuffer) {
        h(byteBuffer);
        if (getVersion() == 1) {
            this.f10427B = org.chromium.support_lib_boundary.util.b.q(V1.a.k(byteBuffer));
            this.f10428C = org.chromium.support_lib_boundary.util.b.q(V1.a.k(byteBuffer));
            this.f10429H = V1.a.j(byteBuffer);
            this.f10430L = V1.a.k(byteBuffer);
        } else {
            this.f10427B = org.chromium.support_lib_boundary.util.b.q(V1.a.j(byteBuffer));
            this.f10428C = org.chromium.support_lib_boundary.util.b.q(V1.a.j(byteBuffer));
            this.f10429H = V1.a.j(byteBuffer);
            this.f10430L = V1.a.j(byteBuffer);
        }
        this.f10431M = V1.a.f(byteBuffer);
        this.f10432Q = V1.a.g(byteBuffer);
        V1.a.h(byteBuffer);
        V1.a.j(byteBuffer);
        V1.a.j(byteBuffer);
        this.f10433X = T4.e.a(byteBuffer);
        this.f10435Z = byteBuffer.getInt();
        this.f10436k0 = byteBuffer.getInt();
        this.f10437p0 = byteBuffer.getInt();
        this.f10438q0 = byteBuffer.getInt();
        this.f10439r0 = byteBuffer.getInt();
        this.f10440s0 = byteBuffer.getInt();
        this.f10434Y = V1.a.j(byteBuffer);
    }

    @Override // P4.c, P4.a
    public final void b(ByteBuffer byteBuffer) {
        i(byteBuffer);
        if (getVersion() == 1) {
            byteBuffer.putLong(org.chromium.support_lib_boundary.util.b.p(this.f10427B));
            byteBuffer.putLong(org.chromium.support_lib_boundary.util.b.p(this.f10428C));
            byteBuffer.putInt((int) this.f10429H);
            byteBuffer.putLong(this.f10430L);
        } else {
            byteBuffer.putInt((int) org.chromium.support_lib_boundary.util.b.p(this.f10427B));
            byteBuffer.putInt((int) org.chromium.support_lib_boundary.util.b.p(this.f10428C));
            byteBuffer.putInt((int) this.f10429H);
            byteBuffer.putInt((int) this.f10430L);
        }
        V1.a.o(byteBuffer, this.f10431M);
        V1.a.p(byteBuffer, this.f10432Q);
        V1.a.q(0, byteBuffer);
        int i7 = (int) 0;
        byteBuffer.putInt(i7);
        byteBuffer.putInt(i7);
        this.f10433X.b(byteBuffer);
        byteBuffer.putInt(this.f10435Z);
        byteBuffer.putInt(this.f10436k0);
        byteBuffer.putInt(this.f10437p0);
        byteBuffer.putInt(this.f10438q0);
        byteBuffer.putInt(this.f10439r0);
        byteBuffer.putInt(this.f10440s0);
        byteBuffer.putInt((int) this.f10434Y);
    }

    @Override // P4.a
    public final long c() {
        return (getVersion() == 1 ? 32L : 20L) + 80;
    }

    public final String toString() {
        org.aspectj.runtime.reflect.c cVarB = org.aspectj.runtime.reflect.a.b(f10413A0, this, this);
        P4.f.a().getClass();
        P4.f.b(cVarB);
        StringBuilder sb2 = new StringBuilder("MovieHeaderBox[creationTime=");
        d0.s(org.aspectj.runtime.reflect.a.b(f10420t0, this, this));
        sb2.append(this.f10427B);
        sb2.append(";modificationTime=");
        d0.s(org.aspectj.runtime.reflect.a.b(f10421u0, this, this));
        sb2.append(this.f10428C);
        sb2.append(";timescale=");
        d0.s(org.aspectj.runtime.reflect.a.b(f10422v0, this, this));
        sb2.append(this.f10429H);
        sb2.append(";duration=");
        d0.s(org.aspectj.runtime.reflect.a.b(f10423w0, this, this));
        sb2.append(this.f10430L);
        sb2.append(";rate=");
        d0.s(org.aspectj.runtime.reflect.a.b(f10424x0, this, this));
        sb2.append(this.f10431M);
        sb2.append(";volume=");
        d0.s(org.aspectj.runtime.reflect.a.b(f10425y0, this, this));
        sb2.append(this.f10432Q);
        sb2.append(";matrix=");
        sb2.append(this.f10433X);
        sb2.append(";nextTrackId=");
        d0.s(org.aspectj.runtime.reflect.a.b(f10426z0, this, this));
        return q0.n(sb2, "]", this.f10434Y);
    }
}
