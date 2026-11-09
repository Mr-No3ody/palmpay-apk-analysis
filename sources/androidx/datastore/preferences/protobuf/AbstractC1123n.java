package androidx.datastore.preferences.protobuf;

import java.io.Serializable;
import java.util.Locale;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1123n implements Iterable, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1120m f16699b = new C1120m(AbstractC1154x1.f16809b);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ByteString$ByteArrayCopier f16700c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f16701a;

    static {
        f16700c = AbstractC1086d.a() ? new C1114k(1) : new C1114k(0);
    }

    public static int b(int i7, int i10, int i11) {
        int i12 = i10 - i7;
        if ((i7 | i10 | i12 | (i11 - i10)) >= 0) {
            return i12;
        }
        if (i7 < 0) {
            throw new IndexOutOfBoundsException(androidx.camera.camera2.internal.F.c(i7, "Beginning index: ", " < 0"));
        }
        if (i10 < i7) {
            throw new IndexOutOfBoundsException(androidx.camera.video.u.h(i7, "Beginning index larger than ending index: ", i10, ", "));
        }
        throw new IndexOutOfBoundsException(androidx.camera.video.u.h(i10, "End index: ", i11, " >= "));
    }

    public static C1120m c(int i7, int i10, byte[] bArr) {
        b(i7, i7 + i10, bArr.length);
        return new C1120m(f16700c.copyFrom(bArr, i7, i10));
    }

    public static C1120m d(String str) {
        return new C1120m(str.getBytes(AbstractC1154x1.f16808a));
    }

    public abstract byte a(int i7);

    public abstract void e(int i7, byte[] bArr);

    public abstract byte f(int i7);

    public abstract r g();

    public abstract int h(int i7, int i10);

    public final int hashCode() {
        int iH = this.f16701a;
        if (iH == 0) {
            int size = size();
            iH = h(size, size);
            if (iH == 0) {
                iH = 1;
            }
            this.f16701a = iH;
        }
        return iH;
    }

    public abstract AbstractC1123n i(int i7);

    public abstract void j(AbstractC1146v abstractC1146v);

    public abstract int size();

    public final String toString() {
        String strQ;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            strQ = AbstractC1102h.q(this);
        } else {
            strQ = AbstractC1102h.q(i(47)) + "...";
        }
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(size);
        sb2.append(" contents=\"");
        return C0.G.r(sb2, strQ, "\">");
    }
}
