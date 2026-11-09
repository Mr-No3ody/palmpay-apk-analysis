package E;

import androidx.camera.core.SurfaceOutput;

/* JADX INFO: renamed from: E.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0203h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SurfaceOutput f2035a;

    public C0203h(SurfaceOutput surfaceOutput) {
        if (surfaceOutput == null) {
            throw new NullPointerException("Null surfaceOutput");
        }
        this.f2035a = surfaceOutput;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0203h)) {
            return false;
        }
        C0203h c0203h = (C0203h) obj;
        c0203h.getClass();
        return this.f2035a.equals(c0203h.f2035a);
    }

    public final int hashCode() {
        return this.f2035a.hashCode() ^ (-721379959);
    }

    public final String toString() {
        return "Event{eventCode=0, surfaceOutput=" + this.f2035a + "}";
    }
}
