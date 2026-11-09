package androidx.camera.core.impl;

import E.C0216v;
import android.util.Range;
import android.util.Size;

/* JADX INFO: renamed from: androidx.camera.core.impl.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0993n {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Range f14107f = new Range(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Size f14108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0216v f14109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Range f14110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final androidx.camera.camera2.impl.b f14111d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f14112e;

    public C0993n(Size size, C0216v c0216v, Range range, androidx.camera.camera2.impl.b bVar, boolean z3) {
        this.f14108a = size;
        this.f14109b = c0216v;
        this.f14110c = range;
        this.f14111d = bVar;
        this.f14112e = z3;
    }

    public final C0991m a() {
        C0991m c0991m = new C0991m();
        c0991m.f14102a = this.f14108a;
        c0991m.f14103b = this.f14109b;
        c0991m.f14104c = this.f14110c;
        c0991m.f14105d = this.f14111d;
        c0991m.f14106e = Boolean.valueOf(this.f14112e);
        return c0991m;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0993n)) {
            return false;
        }
        C0993n c0993n = (C0993n) obj;
        if (!this.f14108a.equals(c0993n.f14108a) || !this.f14109b.equals(c0993n.f14109b) || !this.f14110c.equals(c0993n.f14110c)) {
            return false;
        }
        androidx.camera.camera2.impl.b bVar = c0993n.f14111d;
        androidx.camera.camera2.impl.b bVar2 = this.f14111d;
        if (bVar2 == null) {
            if (bVar != null) {
                return false;
            }
        } else if (!bVar2.equals(bVar)) {
            return false;
        }
        return this.f14112e == c0993n.f14112e;
    }

    public final int hashCode() {
        int iHashCode = (((((this.f14108a.hashCode() ^ 1000003) * 1000003) ^ this.f14109b.hashCode()) * 1000003) ^ this.f14110c.hashCode()) * 1000003;
        androidx.camera.camera2.impl.b bVar = this.f14111d;
        return ((iHashCode ^ (bVar == null ? 0 : bVar.hashCode())) * 1000003) ^ (this.f14112e ? 1231 : 1237);
    }

    public final String toString() {
        return "StreamSpec{resolution=" + this.f14108a + ", dynamicRange=" + this.f14109b + ", expectedFrameRateRange=" + this.f14110c + ", implementationOptions=" + this.f14111d + ", zslDisabled=" + this.f14112e + "}";
    }
}
