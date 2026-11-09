package androidx.camera.core.impl;

import E.C0216v;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: androidx.camera.core.impl.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0987k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC0970b0 f14094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f14095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f14097d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0216v f14098e;

    public C0987k(AbstractC0970b0 abstractC0970b0, List list, int i7, int i10, C0216v c0216v) {
        this.f14094a = abstractC0970b0;
        this.f14095b = list;
        this.f14096c = i7;
        this.f14097d = i10;
        this.f14098e = c0216v;
    }

    public static C0985j a(AbstractC0970b0 abstractC0970b0) {
        C0985j c0985j = new C0985j();
        if (abstractC0970b0 == null) {
            throw new NullPointerException("Null surface");
        }
        c0985j.f14086a = abstractC0970b0;
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            throw new NullPointerException("Null sharedSurfaces");
        }
        c0985j.f14087b = list;
        c0985j.f14088c = -1;
        c0985j.f14089d = -1;
        c0985j.f14090e = C0216v.f2122d;
        return c0985j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0987k)) {
            return false;
        }
        C0987k c0987k = (C0987k) obj;
        return this.f14094a.equals(c0987k.f14094a) && this.f14095b.equals(c0987k.f14095b) && this.f14096c == c0987k.f14096c && this.f14097d == c0987k.f14097d && this.f14098e.equals(c0987k.f14098e);
    }

    public final int hashCode() {
        return ((((((((this.f14094a.hashCode() ^ 1000003) * 1000003) ^ this.f14095b.hashCode()) * (-721379959)) ^ this.f14096c) * 1000003) ^ this.f14097d) * 1000003) ^ this.f14098e.hashCode();
    }

    public final String toString() {
        return "OutputConfig{surface=" + this.f14094a + ", sharedSurfaces=" + this.f14095b + ", physicalCameraId=null, mirrorMode=" + this.f14096c + ", surfaceGroupId=" + this.f14097d + ", dynamicRange=" + this.f14098e + "}";
    }
}
