package W1;

import C0.G;
import com.adjust.sdk.Constants;
import com.horcrux.svg.d0;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public final class g extends P4.c {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final Map f10380Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final /* synthetic */ org.aspectj.runtime.reflect.b f10381Z;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final /* synthetic */ org.aspectj.runtime.reflect.b f10382k0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final /* synthetic */ org.aspectj.runtime.reflect.b f10383p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final /* synthetic */ org.aspectj.runtime.reflect.b f10384q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final /* synthetic */ org.aspectj.runtime.reflect.b f10385r0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public String f10386B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public String f10387C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public long f10388H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public long f10389L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public long f10390M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public boolean f10391Q;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public long f10392X;

    static {
        org.aspectj.runtime.reflect.a aVar = new org.aspectj.runtime.reflect.a(g.class, "HandlerBox.java");
        f10381Z = aVar.e(aVar.d("getHandlerType", "com.coremedia.iso.boxes.HandlerBox", "", "", "java.lang.String"), 78);
        f10382k0 = aVar.e(aVar.d("setName", "com.coremedia.iso.boxes.HandlerBox", "java.lang.String", "name", "void"), 87);
        f10383p0 = aVar.e(aVar.d("setHandlerType", "com.coremedia.iso.boxes.HandlerBox", "java.lang.String", "handlerType", "void"), 91);
        f10384q0 = aVar.e(aVar.d("getName", "com.coremedia.iso.boxes.HandlerBox", "", "", "java.lang.String"), 95);
        aVar.e(aVar.d("getHumanReadableTrackType", "com.coremedia.iso.boxes.HandlerBox", "", "", "java.lang.String"), 99);
        f10385r0 = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.HandlerBox", "", "", "java.lang.String"), 149);
        HashMap map = new HashMap();
        map.put("odsm", "ObjectDescriptorStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        map.put("crsm", "ClockReferenceStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        map.put("sdsm", "SceneDescriptionStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        map.put("m7sm", "MPEG7Stream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        map.put("ocsm", "ObjectContentInfoStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        map.put("ipsm", "IPMP Stream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        map.put("mjsm", "MPEG-J Stream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        map.put("mdir", "Apple Meta Data iTunes Reader");
        map.put("mp7b", "MPEG-7 binary XML");
        map.put("mp7t", "MPEG-7 XML");
        map.put("vide", "Video Track");
        map.put("soun", "Sound Track");
        map.put("hint", "Hint Track");
        map.put("appl", "Apple specific");
        map.put(Constants.REFERRER_API_META, "Timed Metadata track - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        f10380Y = Collections.unmodifiableMap(map);
    }

    @Override // P4.c, P4.a
    public final void a(ByteBuffer byteBuffer) {
        h(byteBuffer);
        this.f10392X = V1.a.j(byteBuffer);
        this.f10386B = V1.a.d(byteBuffer);
        this.f10388H = V1.a.j(byteBuffer);
        this.f10389L = V1.a.j(byteBuffer);
        this.f10390M = V1.a.j(byteBuffer);
        if (byteBuffer.remaining() <= 0) {
            this.f10391Q = false;
            return;
        }
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        try {
            String str = new String(bArr, Constants.ENCODING);
            this.f10387C = str;
            if (!str.endsWith(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR)) {
                this.f10391Q = false;
            } else {
                this.f10387C = androidx.camera.video.u.f(1, 0, this.f10387C);
                this.f10391Q = true;
            }
        } catch (UnsupportedEncodingException e10) {
            throw new Error(e10);
        }
    }

    @Override // P4.c, P4.a
    public final void b(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt((int) this.f10392X);
        byteBuffer.put(V1.b.d(this.f10386B));
        byteBuffer.putInt((int) this.f10388H);
        byteBuffer.putInt((int) this.f10389L);
        byteBuffer.putInt((int) this.f10390M);
        String str = this.f10387C;
        if (str != null) {
            byteBuffer.put(V1.a.b(str));
        }
        if (this.f10391Q) {
            byteBuffer.put((byte) 0);
        }
    }

    @Override // P4.a
    public final long c() {
        return this.f10391Q ? V1.a.m(this.f10387C) + 25 : V1.a.m(this.f10387C) + 24;
    }

    public final String toString() {
        org.aspectj.runtime.reflect.c cVarB = org.aspectj.runtime.reflect.a.b(f10385r0, this, this);
        P4.f.a().getClass();
        P4.f.b(cVarB);
        StringBuilder sb2 = new StringBuilder("HandlerBox[handlerType=");
        d0.s(org.aspectj.runtime.reflect.a.b(f10381Z, this, this));
        sb2.append(this.f10386B);
        sb2.append(";name=");
        d0.s(org.aspectj.runtime.reflect.a.b(f10384q0, this, this));
        return G.r(sb2, this.f10387C, "]");
    }
}
