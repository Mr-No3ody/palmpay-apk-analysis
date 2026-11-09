package S4;

import com.adjust.sdk.Constants;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends b {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Logger f8729p = Logger.getLogger(f.class.getName());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8730d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f8731e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f8732f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f8733g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f8734h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f8735i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f8736j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f8737k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f8738l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public d f8739m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public l f8740n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList f8741o;

    @Override // S4.b
    public final void b(ByteBuffer byteBuffer) {
        this.f8730d = V1.a.h(byteBuffer);
        int iA = V1.a.a(byteBuffer.get());
        int i7 = iA >>> 7;
        this.f8731e = i7;
        this.f8732f = (iA >>> 6) & 1;
        this.f8733g = (iA >>> 5) & 1;
        this.f8734h = iA & 31;
        if (i7 == 1) {
            this.f8737k = V1.a.h(byteBuffer);
        }
        if (this.f8732f == 1) {
            int iA2 = V1.a.a(byteBuffer.get());
            this.f8735i = iA2;
            byte[] bArr = new byte[iA2];
            byteBuffer.get(bArr);
            try {
                this.f8736j = new String(bArr, Constants.ENCODING);
            } catch (UnsupportedEncodingException e10) {
                throw new Error(e10);
            }
        }
        if (this.f8733g == 1) {
            this.f8738l = V1.a.h(byteBuffer);
        }
        int i10 = this.f8715c + 4 + (this.f8731e == 1 ? 2 : 0) + (this.f8732f == 1 ? this.f8735i + 1 : 0) + (this.f8733g == 1 ? 2 : 0);
        int iPosition = byteBuffer.position();
        int iA3 = a();
        int i11 = i10 + 2;
        Logger logger = f8729p;
        if (iA3 > i11) {
            b bVarA = j.a(-1, byteBuffer);
            logger.finer(bVarA + " - ESDescriptor1 read: " + (byteBuffer.position() - iPosition) + ", size: " + Integer.valueOf(bVarA.a()));
            int iA4 = bVarA.a();
            byteBuffer.position(iPosition + iA4);
            i10 += iA4;
            if (bVarA instanceof d) {
                this.f8739m = (d) bVarA;
            }
        }
        int iPosition2 = byteBuffer.position();
        if (a() > i10 + 2) {
            b bVarA2 = j.a(-1, byteBuffer);
            logger.finer(bVarA2 + " - ESDescriptor2 read: " + (byteBuffer.position() - iPosition2) + ", size: " + Integer.valueOf(bVarA2.a()));
            int iA5 = bVarA2.a();
            byteBuffer.position(iPosition2 + iA5);
            i10 += iA5;
            if (bVarA2 instanceof l) {
                this.f8740n = (l) bVarA2;
            }
        } else {
            logger.warning("SLConfigDescriptor is missing!");
        }
        while (a() - i10 > 2) {
            int iPosition3 = byteBuffer.position();
            b bVarA3 = j.a(-1, byteBuffer);
            logger.finer(bVarA3 + " - ESDescriptor3 read: " + (byteBuffer.position() - iPosition3) + ", size: " + Integer.valueOf(bVarA3.a()));
            int iA6 = bVarA3.a();
            byteBuffer.position(iPosition3 + iA6);
            i10 += iA6;
            this.f8741o.add(bVarA3);
        }
    }

    public final int c() {
        int i7;
        int i10 = this.f8731e > 0 ? 7 : 5;
        if (this.f8732f > 0) {
            i10 += this.f8735i + 1;
        }
        if (this.f8733g > 0) {
            i10 += 2;
        }
        a aVar = this.f8739m.f8726j;
        if (aVar == null) {
            i7 = 0;
        } else {
            if (aVar.f8692e != 2) {
                throw new UnsupportedOperationException("can't serialize that yet");
            }
            i7 = 4;
        }
        int i11 = i7 + 15 + i10;
        this.f8740n.getClass();
        return i11 + 3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f8732f != fVar.f8732f || this.f8735i != fVar.f8735i || this.f8737k != fVar.f8737k || this.f8730d != fVar.f8730d || this.f8738l != fVar.f8738l || this.f8733g != fVar.f8733g || this.f8731e != fVar.f8731e || this.f8734h != fVar.f8734h) {
            return false;
        }
        String str = this.f8736j;
        if (str != null) {
            if (!str.equals(fVar.f8736j)) {
                return false;
            }
        } else if (fVar.f8736j != null) {
            return false;
        }
        d dVar = this.f8739m;
        if (dVar != null) {
            if (!dVar.equals(fVar.f8739m)) {
                return false;
            }
        } else if (fVar.f8739m != null) {
            return false;
        }
        ArrayList arrayList = this.f8741o;
        ArrayList arrayList2 = fVar.f8741o;
        if (arrayList != null) {
            if (!arrayList.equals(arrayList2)) {
                return false;
            }
        } else if (arrayList2 != null) {
            return false;
        }
        l lVar = this.f8740n;
        l lVar2 = fVar.f8740n;
        if (lVar != null) {
            return lVar.equals(lVar2);
        }
        return lVar2 == null;
    }

    public final int hashCode() {
        int i7 = ((((((((((this.f8730d * 31) + this.f8731e) * 31) + this.f8732f) * 31) + this.f8733g) * 31) + this.f8734h) * 31) + this.f8735i) * 31;
        String str = this.f8736j;
        int iHashCode = (((((i7 + (str != null ? str.hashCode() : 0)) * 961) + this.f8737k) * 31) + this.f8738l) * 31;
        d dVar = this.f8739m;
        int iHashCode2 = (iHashCode + (dVar != null ? dVar.hashCode() : 0)) * 31;
        l lVar = this.f8740n;
        int i10 = (iHashCode2 + (lVar != null ? lVar.f8744d : 0)) * 31;
        ArrayList arrayList = this.f8741o;
        return i10 + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public final String toString() {
        return "ESDescriptor{esId=" + this.f8730d + ", streamDependenceFlag=" + this.f8731e + ", URLFlag=" + this.f8732f + ", oCRstreamFlag=" + this.f8733g + ", streamPriority=" + this.f8734h + ", URLLength=" + this.f8735i + ", URLString='" + this.f8736j + "', remoteODFlag=0, dependsOnEsId=" + this.f8737k + ", oCREsId=" + this.f8738l + ", decoderConfigDescriptor=" + this.f8739m + ", slConfigDescriptor=" + this.f8740n + '}';
    }
}
