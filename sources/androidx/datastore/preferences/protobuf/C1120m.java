package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;
import java.util.Iterator;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1120m extends AbstractC1123n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f16694d;

    public C1120m(byte[] bArr) {
        this.f16701a = 0;
        bArr.getClass();
        this.f16694d = bArr;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1123n
    public byte a(int i7) {
        return this.f16694d[i7];
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1123n
    public void e(int i7, byte[] bArr) {
        System.arraycopy(this.f16694d, 0, bArr, 0, i7);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1123n) || size() != ((AbstractC1123n) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof C1120m)) {
            return obj.equals(this);
        }
        C1120m c1120m = (C1120m) obj;
        int i7 = this.f16701a;
        int i10 = c1120m.f16701a;
        if (i7 != 0 && i10 != 0 && i7 != i10) {
            return false;
        }
        int size = size();
        if (size > c1120m.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > c1120m.size()) {
            StringBuilder sbE = androidx.camera.camera2.internal.F.e(size, "Ran off end of other: 0, ", ", ");
            sbE.append(c1120m.size());
            throw new IllegalArgumentException(sbE.toString());
        }
        int iK = k() + size;
        int iK2 = k();
        int iK3 = c1120m.k();
        while (iK2 < iK) {
            if (this.f16694d[iK2] != c1120m.f16694d[iK3]) {
                return false;
            }
            iK2++;
            iK3++;
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1123n
    public byte f(int i7) {
        return this.f16694d[i7];
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1123n
    public final r g() {
        return r.f(this.f16694d, k(), size(), true);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1123n
    public final int h(int i7, int i10) {
        int iK = k();
        Charset charset = AbstractC1154x1.f16808a;
        for (int i11 = iK; i11 < iK + i10; i11++) {
            i7 = (i7 * 31) + this.f16694d[i11];
        }
        return i7;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1123n
    public final AbstractC1123n i(int i7) {
        int iB = AbstractC1123n.b(0, i7, size());
        if (iB == 0) {
            return AbstractC1123n.f16699b;
        }
        return new C1117l(this.f16694d, k(), iB);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C1110j(this);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1123n
    public final void j(AbstractC1146v abstractC1146v) {
        abstractC1146v.w(this.f16694d, k(), size());
    }

    public int k() {
        return 0;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1123n
    public int size() {
        return this.f16694d.length;
    }
}
