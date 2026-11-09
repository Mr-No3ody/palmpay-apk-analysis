package androidx.camera.core.impl;

import android.hardware.camera2.CaptureRequest;

/* JADX INFO: renamed from: androidx.camera.core.impl.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0971c extends V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f14032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CaptureRequest.Key f14033c;

    public C0971c(String str, Class cls, CaptureRequest.Key key) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.f14031a = str;
        if (cls == null) {
            throw new NullPointerException("Null valueClass");
        }
        this.f14032b = cls;
        this.f14033c = key;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof V)) {
            return false;
        }
        C0971c c0971c = (C0971c) ((V) obj);
        if (!this.f14031a.equals(c0971c.f14031a)) {
            return false;
        }
        if (!this.f14032b.equals(c0971c.f14032b)) {
            return false;
        }
        CaptureRequest.Key key = c0971c.f14033c;
        CaptureRequest.Key key2 = this.f14033c;
        if (key2 == null) {
            return key == null;
        }
        return key2.equals(key);
    }

    public final int hashCode() {
        int iHashCode = (((this.f14031a.hashCode() ^ 1000003) * 1000003) ^ this.f14032b.hashCode()) * 1000003;
        CaptureRequest.Key key = this.f14033c;
        return iHashCode ^ (key == null ? 0 : key.hashCode());
    }

    public final String toString() {
        return "Option{id=" + this.f14031a + ", valueClass=" + this.f14032b + ", token=" + this.f14033c + "}";
    }
}
