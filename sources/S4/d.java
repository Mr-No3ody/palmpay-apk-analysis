package S4;

import androidx.camera.video.u;
import com.google.maps.android.BuildConfig;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Logger f8719m = Logger.getLogger(d.class.getName());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8720d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f8721e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f8722f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f8723g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f8724h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f8725i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a f8726j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ArrayList f8727k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public byte[] f8728l;

    @Override // S4.b
    public final void b(ByteBuffer byteBuffer) {
        this.f8720d = V1.a.a(byteBuffer.get());
        int iA = V1.a.a(byteBuffer.get());
        this.f8721e = iA >>> 2;
        this.f8722f = (iA >> 1) & 1;
        this.f8723g = V1.a.i(byteBuffer);
        this.f8724h = V1.a.j(byteBuffer);
        this.f8725i = V1.a.j(byteBuffer);
        int iRemaining = byteBuffer.remaining();
        Logger logger = f8719m;
        if (iRemaining > 2) {
            int iPosition = byteBuffer.position();
            b bVarA = j.a(this.f8720d, byteBuffer);
            int iPosition2 = byteBuffer.position() - iPosition;
            logger.finer(bVarA + " - DecoderConfigDescr1 read: " + iPosition2 + ", size: " + Integer.valueOf(bVarA.a()));
            int iA2 = bVarA.a();
            if (iPosition2 < iA2) {
                byte[] bArr = new byte[iA2 - iPosition2];
                this.f8728l = bArr;
                byteBuffer.get(bArr);
            }
            if (bVarA instanceof a) {
                this.f8726j = (a) bVarA;
            }
        }
        while (byteBuffer.remaining() > 2) {
            long jPosition = byteBuffer.position();
            b bVarA2 = j.a(this.f8720d, byteBuffer);
            logger.finer(bVarA2 + " - DecoderConfigDescr2 read: " + (((long) byteBuffer.position()) - jPosition) + ", size: " + Integer.valueOf(bVarA2.a()));
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DecoderConfigDescriptor{objectTypeIndication=");
        sb2.append(this.f8720d);
        sb2.append(", streamType=");
        sb2.append(this.f8721e);
        sb2.append(", upStream=");
        sb2.append(this.f8722f);
        sb2.append(", bufferSizeDB=");
        sb2.append(this.f8723g);
        sb2.append(", maxBitRate=");
        sb2.append(this.f8724h);
        sb2.append(", avgBitRate=");
        sb2.append(this.f8725i);
        sb2.append(", decoderSpecificInfo=null, audioSpecificInfo=");
        sb2.append(this.f8726j);
        sb2.append(", configDescriptorDeadBytes=");
        byte[] bArr = this.f8728l;
        if (bArr == null) {
            bArr = new byte[0];
        }
        sb2.append(V1.a.c(0, bArr));
        sb2.append(", profileLevelIndicationDescriptors=");
        ArrayList arrayList = this.f8727k;
        return u.p(sb2, arrayList == null ? BuildConfig.TRAVIS : Arrays.asList(arrayList).toString(), '}');
    }
}
