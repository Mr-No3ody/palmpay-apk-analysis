package O5;

import P4.f;
import S4.c;
import com.adjust.sdk.Constants;
import com.horcrux.svg.d0;
import com.transsnet.palmpay.bean.HomeDialogState;
import com.transsnet.palmpay.send_money.ui.dialog.kkcar.KkCarPayResultDialog;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends P4.a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ org.aspectj.runtime.reflect.b f6560A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ org.aspectj.runtime.reflect.b f6561B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ org.aspectj.runtime.reflect.b f6562C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final /* synthetic */ org.aspectj.runtime.reflect.b f6563H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final /* synthetic */ org.aspectj.runtime.reflect.b f6564L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final /* synthetic */ org.aspectj.runtime.reflect.b f6565M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final /* synthetic */ org.aspectj.runtime.reflect.b f6566Q;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final /* synthetic */ org.aspectj.runtime.reflect.b f6567X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final /* synthetic */ org.aspectj.runtime.reflect.b f6568Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final /* synthetic */ org.aspectj.runtime.reflect.b f6569Z;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final /* synthetic */ org.aspectj.runtime.reflect.b f6570k0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ org.aspectj.runtime.reflect.b f6571v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ org.aspectj.runtime.reflect.b f6572w;
    public b t;

    static {
        org.aspectj.runtime.reflect.a aVar = new org.aspectj.runtime.reflect.a(a.class, "AvcConfigurationBox.java");
        aVar.e(aVar.d("getConfigurationVersion", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"), 44);
        aVar.e(aVar.d("getAvcProfileIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"), 48);
        f6561B = aVar.e(aVar.d("setAvcLevelIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "avcLevelIndication", "void"), 84);
        f6562C = aVar.e(aVar.d("setLengthSizeMinusOne", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "lengthSizeMinusOne", "void"), 88);
        f6563H = aVar.e(aVar.d("setSequenceParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.util.List", "sequenceParameterSets", "void"), 92);
        f6564L = aVar.e(aVar.d("setPictureParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.util.List", "pictureParameterSets", "void"), 96);
        aVar.e(aVar.d("getChromaFormat", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"), 100);
        f6565M = aVar.e(aVar.d("setChromaFormat", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "chromaFormat", "void"), 104);
        aVar.e(aVar.d("getBitDepthLumaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"), 108);
        f6566Q = aVar.e(aVar.d("setBitDepthLumaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "bitDepthLumaMinus8", "void"), HomeDialogState.PRIORITY_SYSTEM_COMMON_ERROR);
        aVar.e(aVar.d("getBitDepthChromaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"), 116);
        f6567X = aVar.e(aVar.d("setBitDepthChromaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "bitDepthChromaMinus8", "void"), KkCarPayResultDialog.FREE_RIDE_TITLE_MARGIN_TOP_DP);
        aVar.e(aVar.d("getProfileCompatibility", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"), 52);
        aVar.e(aVar.d("getSequenceParameterSetExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "java.util.List"), 124);
        aVar.e(aVar.d("setSequenceParameterSetExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.util.List", "sequenceParameterSetExts", "void"), 128);
        aVar.e(aVar.d("hasExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "boolean"), 132);
        aVar.e(aVar.d("setHasExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "boolean", "hasExts", "void"), 136);
        f6568Y = aVar.e(aVar.d("getContentSize", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", Constants.LONG), 147);
        f6569Z = aVar.e(aVar.d("getContent", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.nio.ByteBuffer", "byteBuffer", "void"), 153);
        aVar.e(aVar.d("getSPS", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "[Ljava.lang.String;"), 158);
        aVar.e(aVar.d("getPPS", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "[Ljava.lang.String;"), 162);
        aVar.e(aVar.d("getavcDecoderConfigurationRecord", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "com.mp4parser.iso14496.part15.AvcDecoderConfigurationRecord"), 167);
        f6570k0 = aVar.e(aVar.d("toString", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "java.lang.String"), 172);
        aVar.e(aVar.d("getAvcLevelIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"), 56);
        aVar.e(aVar.d("getLengthSizeMinusOne", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"), 60);
        aVar.e(aVar.d("getSequenceParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "java.util.List"), 64);
        aVar.e(aVar.d("getPictureParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "java.util.List"), 68);
        f6571v = aVar.e(aVar.d("setConfigurationVersion", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "configurationVersion", "void"), 72);
        f6572w = aVar.e(aVar.d("setAvcProfileIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "avcProfileIndication", "void"), 76);
        f6560A = aVar.e(aVar.d("setProfileCompatibility", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "profileCompatibility", "void"), 80);
    }

    @Override // P4.a
    public final void a(ByteBuffer byteBuffer) {
        int i7;
        b bVar = new b();
        bVar.f6578f = new ArrayList();
        bVar.f6579g = new ArrayList();
        bVar.f6580h = true;
        bVar.f6581i = 1;
        bVar.f6582j = 0;
        bVar.f6583k = 0;
        bVar.f6584l = new ArrayList();
        bVar.f6585m = 63;
        bVar.f6586n = 7;
        bVar.f6587o = 31;
        bVar.f6588p = 31;
        bVar.f6589q = 31;
        bVar.f6573a = V1.a.l(byteBuffer);
        bVar.f6574b = V1.a.a(byteBuffer.get());
        bVar.f6575c = V1.a.a(byteBuffer.get());
        bVar.f6576d = V1.a.a(byteBuffer.get());
        c cVar = new c(byteBuffer, 0);
        bVar.f6585m = cVar.a(6);
        bVar.f6577e = cVar.a(2);
        bVar.f6586n = cVar.a(3);
        int iA = cVar.a(5);
        for (int i10 = 0; i10 < iA; i10++) {
            byte[] bArr = new byte[V1.a.h(byteBuffer)];
            byteBuffer.get(bArr);
            bVar.f6578f.add(bArr);
        }
        long jA = V1.a.a(byteBuffer.get());
        for (int i11 = 0; i11 < jA; i11++) {
            byte[] bArr2 = new byte[V1.a.h(byteBuffer)];
            byteBuffer.get(bArr2);
            bVar.f6579g.add(bArr2);
        }
        if (byteBuffer.remaining() < 4) {
            bVar.f6580h = false;
        }
        if (bVar.f6580h && ((i7 = bVar.f6574b) == 100 || i7 == 110 || i7 == 122 || i7 == 144)) {
            c cVar2 = new c(byteBuffer, 0);
            bVar.f6587o = cVar2.a(6);
            bVar.f6581i = cVar2.a(2);
            bVar.f6588p = cVar2.a(5);
            bVar.f6582j = cVar2.a(3);
            bVar.f6589q = cVar2.a(5);
            bVar.f6583k = cVar2.a(3);
            long jA2 = V1.a.a(byteBuffer.get());
            for (int i12 = 0; i12 < jA2; i12++) {
                byte[] bArr3 = new byte[V1.a.h(byteBuffer)];
                byteBuffer.get(bArr3);
                bVar.f6584l.add(bArr3);
            }
        } else {
            bVar.f6581i = -1;
            bVar.f6582j = -1;
            bVar.f6583k = -1;
        }
        this.t = bVar;
    }

    @Override // P4.a
    public final void b(ByteBuffer byteBuffer) {
        d0.s(org.aspectj.runtime.reflect.a.c(f6569Z, this, this, byteBuffer));
        b bVar = this.t;
        V1.a.s(bVar.f6573a, byteBuffer);
        byteBuffer.put((byte) (bVar.f6574b & 255));
        byteBuffer.put((byte) (bVar.f6575c & 255));
        byteBuffer.put((byte) (bVar.f6576d & 255));
        c cVar = new c(byteBuffer, 1);
        cVar.c(bVar.f6585m, 6);
        cVar.c(bVar.f6577e, 2);
        cVar.c(bVar.f6586n, 3);
        cVar.c(bVar.f6579g.size(), 5);
        for (byte[] bArr : bVar.f6578f) {
            V1.a.q(bArr.length, byteBuffer);
            byteBuffer.put(bArr);
        }
        byteBuffer.put((byte) (bVar.f6579g.size() & 255));
        for (byte[] bArr2 : bVar.f6579g) {
            V1.a.q(bArr2.length, byteBuffer);
            byteBuffer.put(bArr2);
        }
        if (bVar.f6580h) {
            int i7 = bVar.f6574b;
            if (i7 == 100 || i7 == 110 || i7 == 122 || i7 == 144) {
                c cVar2 = new c(byteBuffer, 1);
                cVar2.c(bVar.f6587o, 6);
                cVar2.c(bVar.f6581i, 2);
                cVar2.c(bVar.f6588p, 5);
                cVar2.c(bVar.f6582j, 3);
                cVar2.c(bVar.f6589q, 5);
                cVar2.c(bVar.f6583k, 3);
                for (byte[] bArr3 : bVar.f6584l) {
                    V1.a.q(bArr3.length, byteBuffer);
                    byteBuffer.put(bArr3);
                }
            }
        }
    }

    @Override // P4.a
    public final long c() {
        int i7;
        d0.s(org.aspectj.runtime.reflect.a.b(f6568Y, this, this));
        b bVar = this.t;
        Iterator it = bVar.f6578f.iterator();
        long length = 6;
        while (it.hasNext()) {
            length = length + 2 + ((long) ((byte[]) it.next()).length);
        }
        long length2 = length + 1;
        Iterator it2 = bVar.f6579g.iterator();
        while (it2.hasNext()) {
            length2 = length2 + 2 + ((long) ((byte[]) it2.next()).length);
        }
        if (!bVar.f6580h || ((i7 = bVar.f6574b) != 100 && i7 != 110 && i7 != 122 && i7 != 144)) {
            return length2;
        }
        long length3 = length2 + 4;
        Iterator it3 = bVar.f6584l.iterator();
        while (it3.hasNext()) {
            length3 = length3 + 2 + ((long) ((byte[]) it3.next()).length);
        }
        return length3;
    }

    public final void h(int i7) {
        d0.s(org.aspectj.runtime.reflect.a.c(f6561B, this, this, new Integer(i7)));
        this.t.f6576d = i7;
    }

    public final String toString() {
        org.aspectj.runtime.reflect.c cVarB = org.aspectj.runtime.reflect.a.b(f6570k0, this, this);
        f.a().getClass();
        f.b(cVarB);
        return "AvcConfigurationBox{avcDecoderConfigurationRecord=" + this.t + '}';
    }
}
