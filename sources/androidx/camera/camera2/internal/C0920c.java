package androidx.camera.camera2.internal;

import android.util.Size;
import androidx.camera.core.impl.C0993n;
import androidx.camera.core.impl.UseCaseConfig;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.camera.camera2.internal.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0920c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f13364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.camera.core.impl.H0 f13365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final UseCaseConfig f13366d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Size f13367e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0993n f13368f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f13369g;

    public C0920c(String str, Class cls, androidx.camera.core.impl.H0 h7, UseCaseConfig useCaseConfig, Size size, C0993n c0993n, ArrayList arrayList) {
        if (str == null) {
            throw new NullPointerException("Null useCaseId");
        }
        this.f13363a = str;
        this.f13364b = cls;
        if (h7 == null) {
            throw new NullPointerException("Null sessionConfig");
        }
        this.f13365c = h7;
        if (useCaseConfig == null) {
            throw new NullPointerException("Null useCaseConfig");
        }
        this.f13366d = useCaseConfig;
        this.f13367e = size;
        this.f13368f = c0993n;
        this.f13369g = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0920c)) {
            return false;
        }
        C0920c c0920c = (C0920c) obj;
        if (!this.f13363a.equals(c0920c.f13363a) || !this.f13364b.equals(c0920c.f13364b) || !this.f13365c.equals(c0920c.f13365c) || !this.f13366d.equals(c0920c.f13366d)) {
            return false;
        }
        Size size = c0920c.f13367e;
        Size size2 = this.f13367e;
        if (size2 == null) {
            if (size != null) {
                return false;
            }
        } else if (!size2.equals(size)) {
            return false;
        }
        C0993n c0993n = c0920c.f13368f;
        C0993n c0993n2 = this.f13368f;
        if (c0993n2 == null) {
            if (c0993n != null) {
                return false;
            }
        } else if (!c0993n2.equals(c0993n)) {
            return false;
        }
        ArrayList arrayList = c0920c.f13369g;
        ArrayList arrayList2 = this.f13369g;
        if (arrayList2 == null) {
            return arrayList == null;
        }
        return arrayList2.equals(arrayList);
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f13363a.hashCode() ^ 1000003) * 1000003) ^ this.f13364b.hashCode()) * 1000003) ^ this.f13365c.hashCode()) * 1000003) ^ this.f13366d.hashCode()) * 1000003;
        Size size = this.f13367e;
        int iHashCode2 = (iHashCode ^ (size == null ? 0 : size.hashCode())) * 1000003;
        C0993n c0993n = this.f13368f;
        int iHashCode3 = (iHashCode2 ^ (c0993n == null ? 0 : c0993n.hashCode())) * 1000003;
        ArrayList arrayList = this.f13369g;
        return iHashCode3 ^ (arrayList != null ? arrayList.hashCode() : 0);
    }

    public final String toString() {
        return "UseCaseInfo{useCaseId=" + this.f13363a + ", useCaseType=" + this.f13364b + ", sessionConfig=" + this.f13365c + ", useCaseConfig=" + this.f13366d + ", surfaceResolution=" + this.f13367e + ", streamSpec=" + this.f13368f + ", captureTypes=" + this.f13369g + "}";
    }
}
